package com.example.drawermenu.presentation.mapper

import com.example.drawermenu.domain.model.GetDrawer
import com.example.drawermenu.presentation.model.Drawer


fun GetDrawer.toDrawer() =
    Drawer(
        id = id,
        icon = icon,
        text = text,
        value = value
    )

fun Drawer.toGetDrawer() =
    GetDrawer(
        id = id,
        icon = icon,
        text = text,
        value = value
    )