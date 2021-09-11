package com.anugrahdev.pltestingproject.data.remote

import com.anugrahdev.pltestingproject.data.remote.responses.ImageResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RestAPI {

    @GET("api")
    suspend fun searchForImage(
        @Query("key") key:String,
        @Query("q") q:String
    ):Response<ImageResponseModel>

}