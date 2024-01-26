package com.example.drawermenu.data.repository

import com.example.drawermenu.R
import com.example.drawermenu.domain.model.GetDrawer
import com.example.drawermenu.domain.repository.DrawerRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class DrawerRepositoryImpl @Inject constructor(

) : DrawerRepository {
    override fun getListItem(): Flow<List<GetDrawer>> {
        return flowOf(
            listOf(
                GetDrawer(
                    icon = R.drawable.ic_dashboard,
                    text = "Dashboard"
                ),
                GetDrawer(
                    icon = R.drawable.ic_pesan,
                    text = "Pesan",
                    value = "15"
                ),
                GetDrawer(
                    icon = R.drawable.ic_notification,
                    text = "Notifikasi",
                    value = "20"
                ),
                GetDrawer(
                    icon = R.drawable.ic_calendar,
                    text = "Kalendar",
                ),
                GetDrawer(
                    icon = R.drawable.ic_statistik,
                    text = "Statistik",
                ),
                GetDrawer(
                    icon = R.drawable.ic_setting,
                    text = "Pengaturan",
                )
            )
        )
    }

}