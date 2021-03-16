package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.gson.Gson
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.data.model.ProfileData
import com.nsdevil.ubtmobilev3.databinding.FragmentSettingBinding
import com.nsdevil.ubtmobilev3.utilities.getColorRes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingFragment : BaseFragment() {

    private lateinit var binding: FragmentSettingBinding

    private val args : SettingFragmentArgs by navArgs()

    val profileForm: ProfileData get() = Gson().fromJson(args.ProfileDataString, ProfileData::class.java)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentSettingBinding.inflate(inflater,container,false)
        context ?: return binding.root

        (activity as AppCompatActivity).setSupportActionBar(binding.bar)
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            android.R.id.home -> {
                findNavController().popBackStack()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}