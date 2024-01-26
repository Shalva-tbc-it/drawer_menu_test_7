package com.example.drawermenu.data.model

import java.util.UUID

data class DrawerDTO(
    val id: UUID = UUID.randomUUID(),
    val icon: Int,
    val text: String,
    val value: String? = null
)
