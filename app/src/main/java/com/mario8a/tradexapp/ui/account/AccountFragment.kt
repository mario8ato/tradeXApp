package com.mario8a.tradexapp.ui.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mario8a.tradexapp.databinding.FragmentAccountBinding


class AccountFragment : Fragment() {

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