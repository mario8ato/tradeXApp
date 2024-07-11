package com.mario8a.tradexapp.ui.account

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.mario8a.tradexapp.databinding.FragmentAccountBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AccountFragment : Fragment() {

    private val accountViewModel by viewModels<AccountViewModel>()

    private var _biding: FragmentAccountBinding? = null
    private val binding get() = _biding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _biding = FragmentAccountBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}