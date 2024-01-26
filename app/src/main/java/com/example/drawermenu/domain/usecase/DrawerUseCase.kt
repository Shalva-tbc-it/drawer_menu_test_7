package com.example.drawermenu.domain.usecase

import com.example.drawermenu.domain.repository.DrawerRepository
import javax.inject.Inject

class DrawerUseCase @Inject constructor(
    private val repository: DrawerRepository
) {
    suspend operator fun invoke() = repository.getListItem()
}