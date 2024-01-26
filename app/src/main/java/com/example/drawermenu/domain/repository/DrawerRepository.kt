package com.example.drawermenu.domain.repository

import com.example.drawermenu.domain.model.GetDrawer
import kotlinx.coroutines.flow.Flow

interface DrawerRepository {
    fun getListItem(): Flow<List<GetDrawer>>
}