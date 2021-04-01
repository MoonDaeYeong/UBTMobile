package com.nsdevil.ubtmobilev3.ui.setting

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nsdevil.ubtmobilev3.R
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.databinding.FragmentSettingHomeBinding
import com.nsdevil.ubtmobilev3.ui.SettingFragment
import com.nsdevil.ubtmobilev3.utilities.getColorRes

class SettingHomeFragment : BaseFragment() {

    private lateinit var binding: FragmentSettingHomeBinding

    private val settingFragment get() = parentFragment?.parentFragment as SettingFragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = FragmentSettingHomeBinding.inflate(inflater, container, false)
        context ?: return binding.root

        setBindItem()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            profileData = settingFragment.profileForm

            btnUserInfo.setOnClickListener {
                val directions = SettingHomeFragmentDirections.actionSettingHomeFragmentToEditProfileFragment()
                findNavController().navigate(directions)
            }

            btnPasswordChange.setOnClickListener {
                val directions = SettingHomeFragmentDirections.actionSettingHomeFragmentToPassChangeFragment()
                findNavController().navigate(directions)
            }
        }
    }
}