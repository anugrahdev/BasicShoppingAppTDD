package com.anugrahdev.pltestingproject.data.remote.responses


import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep

@Keep
data class ImageResponseModel(
    @SerializedName("hits")
    val hits: List<HitModel>?,
    @SerializedName("total")
    val total: Int?,
    @SerializedName("totalHits")
    val totalHits: Int?
)