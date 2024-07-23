package com.mario8a.tradexapp.ui.account.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mario8a.tradexapp.domain.model.AccountInfo

class AccountAdapter(private var accountList: List<AccountInfo> = emptyList()): RecyclerView.Adapter<AccountViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AccountViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = accountList.size

    override fun onBindViewHolder(holder: AccountViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}