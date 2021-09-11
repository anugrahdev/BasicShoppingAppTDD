package com.anugrahdev.pltestingproject.di

import android.content.Context
import androidx.room.Room
import com.anugrahdev.pltestingproject.data.Constant
import com.anugrahdev.pltestingproject.data.local.ShoppingDao
import com.anugrahdev.pltestingproject.data.local.ShoppingDatabase
import com.anugrahdev.pltestingproject.data.remote.RestAPI
import com.anugrahdev.pltestingproject.repositories.DefaultShoppingRepository
import com.anugrahdev.pltestingproject.repositories.ShoppingRepository
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideShoppingDatabase(
        @ApplicationContext context: Context,
    ) = Room.databaseBuilder(context, ShoppingDatabase::class.java, Constant.DB_NAME).build()

    @Singleton
    @Provides
    fun provideDaoObject(
        database: ShoppingDatabase
    ) = database.shoppingDao()

    @Provides
    @Singleton
    fun provideRestApiService(): RestAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constant.BASE_URL)
            .build()
            .create(RestAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideShoppingRepository(
        dao: ShoppingDao,
        api: RestAPI,
    ) : ShoppingRepository = DefaultShoppingRepository(dao, api)

}