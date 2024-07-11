package com.mario8a.tradexapp.ui.trade

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mario8a.tradexapp.databinding.FragmentTradeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TradeFragment : Fragment() {

    private var _biding: FragmentTradeBinding? = null
    private val binding get() = _biding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _biding = FragmentTradeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}