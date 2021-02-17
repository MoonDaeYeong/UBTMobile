package com.nsdevil.ubtmobilev3.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.gson.Gson
import com.nsdevil.ubtmobilev3.base.BaseFragment
import com.nsdevil.ubtmobilev3.data.model.ProfileData
import com.nsdevil.ubtmobilev3.databinding.FragmentSettingBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SettingFragment : BaseFragment() {

    private lateinit var binding: FragmentSettingBinding

    private val args : SettingFragmentArgs by navArgs()

    private val profileForm: ProfileData get() = Gson().fromJson(args.ProfileDataString, ProfileData::class.java)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentSettingBinding.inflate(inflater,container,false)
        context ?: return binding.root

        setBindItem()

        return binding.root
    }

    private fun setBindItem() {
        binding.apply {
            profileData = profileForm

            btnUserInfo.setOnClickListener {

            }

            btnPasswordChange.setOnClickListener {

            }
        }
    }
}