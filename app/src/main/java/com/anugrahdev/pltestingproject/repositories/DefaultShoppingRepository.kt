package com.anugrahdev.pltestingproject.repositories

import androidx.lifecycle.LiveData
import com.anugrahdev.pltestingproject.base.Resource
import com.anugrahdev.pltestingproject.data.local.ShoppingDao
import com.anugrahdev.pltestingproject.data.local.ShoppingItem
import com.anugrahdev.pltestingproject.data.remote.RestAPI
import com.anugrahdev.pltestingproject.data.remote.responses.ImageResponseModel
import javax.inject.Inject

class DefaultShoppingRepository @Inject constructor(
    private val shoppingDao: ShoppingDao,
    private val restAPI: RestAPI
): ShoppingRepository {
    override suspend fun insertShoppingItem(shoppingItem: ShoppingItem) {
        shoppingDao.insertShoppingItem(shoppingItem)
    }

    override suspend fun deleteShoppingItem(shoppingItem: ShoppingItem) {
        shoppingDao.deleteShoppingItem(shoppingItem)
    }

    override fun getAllShoppingItem(): LiveData<List<ShoppingItem>> {
        return shoppingDao.observeAllShoppingItems()
    }

    override fun getTotalPrice(): LiveData<Float> {
        return shoppingDao.observeTotalPrice()
    }

    override suspend fun searchForImage(imageQuery: String): Resource<ImageResponseModel> {
        return try {
            val response = restAPI.searchForImage(imageQuery)
            if (response.isSuccessful){
                response.body()?.let { responseModel->
                    return@let Resource.success(responseModel)
                } ?: Resource.error("Error Occurred", null)
            }else{
                Resource.error("Error occurred when fetching data", null)
            }
        }catch (e: Exception){
            Resource.error("Error occurred when fetching data", null)
        }
    }


}