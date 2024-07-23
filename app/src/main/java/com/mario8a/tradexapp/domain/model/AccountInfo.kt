package com.mario8a.tradexapp.domain.model

import com.mario8a.tradexapp.R

// data class AccountInfo(val id: String, val displayName: String)

sealed class AccountInfo (val image: Int, val id: String, val displayName: String) {
    data object AccountOne: AccountInfo(R.drawable.ic_account,"10031", "Internal Trading Book")
    data object AccountTwo: AccountInfo(R.drawable.ic_account,"11413", "Private Clients Fount TTXX")
    data object AccountThree: AccountInfo(R.drawable.ic_account,"22214", "Test Account 20")
}