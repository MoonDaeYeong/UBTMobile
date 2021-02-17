package com.nsdevil.ubtmobilev3

import android.Manifest
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Intent
import android.content.IntentSender
import android.content.pm.ShortcutInfo
import android.content.pm.ShortcutManager
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.IntentSenderRequest
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat
import androidx.core.content.IntentCompat
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.TedPermission
import com.nsdevil.ubtmobilev3.base.BaseActivity
import com.nsdevil.ubtmobilev3.databinding.ActivityMainBinding
import com.nsdevil.ubtmobilev3.dialog.ZAlertDialog
import com.nsdevil.ubtmobilev3.utilities.*
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay


@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding

    private val permissionListener: PermissionListener = object : PermissionListener {
        override fun onPermissionGranted() {
            createShortCut()
        }
        override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
            val dialog = ZAlertDialog(this@MainActivity, this@MainActivity)
            dialog.apply {
                setTitle("Warning")
                setMsg("If you deny permission, you cannot use the app.")
                setType(ZAlertDialog.WARNING_TYPE)
                setSingleEventListener(object : ZAlertDialog.SingleEventListener {
                    override fun confirmClick(dialogSelf: ZAlertDialog) {
                        finishAndRemoveTask()
                    }
                })
            }.show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        permissionChk()
        handleNetworkChanges()
    }

    private fun handleNetworkChanges() {
        NetworkUtils.getNetworkLiveData(this).observe(this, { isConnected ->
            if (!isConnected) {
                binding.textViewNetworkStatus.text = getString(R.string.text_no_connectivity)
                binding.networkStatusLayout.apply {
                    show()
                    setBackgroundColor(getColorRes(R.color.colorStatusNotConnected))
                }
            } else {
                binding.textViewNetworkStatus.text = getString(R.string.text_connectivity)
                binding.networkStatusLayout.apply {
                    setBackgroundColor(getColorRes(R.color.colorStatusConnected))

                    animate()
                        .alpha(1f)
                        .setStartDelay(ANIMATION_DURATION)
                        .setDuration(ANIMATION_DURATION)
                        .setListener(object : AnimatorListenerAdapter() {
                            override fun onAnimationEnd(animation: Animator) {
                                hide()
                            }
                        })
                }
            }
        })
    }

    private fun createShortCut() {
        val prefs = getSharedPreferences("pref", MODE_PRIVATE)

        if (!prefs.getBoolean("shortCutExist", false)) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val oreoIntent = Intent(this, MainActivity::class.java)
                oreoIntent.action = Intent.ACTION_CREATE_SHORTCUT
                val drawable: Drawable = ContextCompat.getDrawable( this, R.drawable.ic_ubt_logo )!!
                val bitmap: Bitmap = (drawable as BitmapDrawable).bitmap
                val pinShortcutInfo: ShortcutInfoCompat = ShortcutInfoCompat.Builder(this, "UBT Cloud Mobile").setIntent(oreoIntent).setShortLabel("UBT Cloud Mobile").setIcon(
                    IconCompat.createWithBitmap(bitmap)).build()

                ShortcutManagerCompat.requestPinShortcut(this, pinShortcutInfo, null)

            } else {
                val shortCutIntent = Intent(Intent.ACTION_MAIN)
                shortCutIntent.addCategory(Intent.CATEGORY_LAUNCHER)
                shortCutIntent.setClassName(this, javaClass.name)
                shortCutIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED)
                val intent = Intent()
                intent.putExtra(Intent.EXTRA_SHORTCUT_INTENT, shortCutIntent)
                intent.putExtra(Intent.EXTRA_SHORTCUT_NAME, resources.getString(R.string.app_name) )
                intent.putExtra(Intent.EXTRA_SHORTCUT_ICON_RESOURCE, Intent.ShortcutIconResource.fromContext( this, R.drawable.ic_ubt_logo ) )
                intent.putExtra("duplicate", false)
                Intent.ACTION_CREATE_SHORTCUT
                intent.action = "com.android.launcher.action.INSTALL_SHORTCUT"
                sendBroadcast(intent)
            }
        }
        val editor = prefs.edit()
        editor.putBoolean("shortCutExist", true)
        editor.apply()
    }

    private fun permissionChk() {
        TedPermission.with(this)
            .setPermissionListener(permissionListener)
            .setRationaleTitle(R.string.permission_title)
            .setRationaleMessage(R.string.rationale_message)
            .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
            .setPermissions(
                Manifest.permission.CAMERA,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.INSTALL_SHORTCUT
            )
            .check()
    }

    var finishCount = 0
    override fun onBackPressed() {
        // super.onBackPressed()
        if(finishCount != 0)
            finishAndRemoveTask()
        lifecycleScope.launchWhenResumed {
            finishCount += 1
            if(finishCount == 1)
                Toast.makeText(this@MainActivity, "Press again to finish.", Toast.LENGTH_SHORT).show()
            delay(2000L)
            finishCount = 0
        }
    }
}