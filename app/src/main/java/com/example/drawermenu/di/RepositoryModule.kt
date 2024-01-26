package com.example.drawermenu.di

import com.example.drawermenu.data.repository.DrawerRepositoryImpl
import com.example.drawermenu.domain.repository.DrawerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideDrawerRepository(drawerRepositoryImpl: DrawerRepositoryImpl): DrawerRepository {
        return drawerRepositoryImpl
    }

}