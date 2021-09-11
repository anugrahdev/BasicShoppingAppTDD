package com.anugrahdev.pltestingproject.repositories

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.anugrahdev.pltestingproject.base.Resource
import com.anugrahdev.pltestingproject.data.local.ShoppingItem
import com.anugrahdev.pltestingproject.data.remote.responses.ImageResponseModel

class MockShoppingRepository: ShoppingRepository {

    override suspend fun insertShoppingItem(shoppingItem: ShoppingItem) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteShoppingItem(shoppingItem: ShoppingItem) {
        TODO("Not yet implemented")
    }

    override fun getAllShoppingItem(): LiveData<List<ShoppingItem>> {
        TODO("Not yet implemented")
    }

    override fun getTotalPrice(): LiveData<Float> {
        TODO("Not yet implemented")
    }

    override suspend fun searchForImage(imageQuery: String): Resource<ImageResponseModel> {
        TODO("Not yet implemented")
    }
}