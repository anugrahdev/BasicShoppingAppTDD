package com.anugrahdev.pltestingproject.repositories

import androidx.lifecycle.LiveData
import com.anugrahdev.pltestingproject.base.Resource
import com.anugrahdev.pltestingproject.data.local.ShoppingItem
import com.anugrahdev.pltestingproject.data.remote.responses.ImageResponseModel
import retrofit2.Response

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun getAllShoppingItem(): LiveData<List<ShoppingItem>>

    fun getTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery:String): Resource<ImageResponseModel>

}