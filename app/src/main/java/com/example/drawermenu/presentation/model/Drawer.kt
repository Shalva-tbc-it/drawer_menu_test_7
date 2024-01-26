package com.example.drawermenu.presentation.model

import java.util.UUID

data class Drawer(
    val id: UUID = UUID.randomUUID(),
    val icon: Int,
    val text: String,
    val value: String? = null
)
