package com.example.drawermenu.domain.model

import java.util.UUID

data class GetDrawer (
    val id: UUID = UUID.randomUUID(),
    val icon: Int,
    val text: String,
    val value: String? = null
)