package com.example.drawermenu.presentation.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.drawermenu.domain.usecase.DrawerUseCase
import com.example.drawermenu.presentation.mapper.toDrawer
import com.example.drawermenu.presentation.model.Drawer
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NavHeaderViewModel @Inject constructor(
    private val drawerUseCase: DrawerUseCase
) : ViewModel() {

    private val _listItem = MutableStateFlow<List<Drawer>>(emptyList())
    val listItem: StateFlow<List<Drawer>> get() = _listItem

    init {
        getListItem()
    }


    private fun getListItem(){
        viewModelScope.launch {
            drawerUseCase.invoke().collect { getDrawer ->
                _listItem.update {
                    getDrawer.map { drawer ->
                        drawer.toDrawer()
                    }
                }
            }
        }

    }


}