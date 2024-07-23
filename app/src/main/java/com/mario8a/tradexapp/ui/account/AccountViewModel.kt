package com.mario8a.tradexapp.ui.account

import androidx.lifecycle.ViewModel
import com.mario8a.tradexapp.domain.model.AccountInfo
import com.mario8a.tradexapp.domain.model.AccountInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class AccountViewModel @Inject constructor(): ViewModel() {
    // private var _accountList = MutableLiveData<List<AccountInfo>>()
    private var _accountList = MutableStateFlow<List<AccountInfo>>(emptyList())
    val accountList: StateFlow<List<AccountInfo>> = _accountList

    init {
        _accountList.value = listOf(
            AccountOne, AccountTwo, AccountThree
        )
    }
}