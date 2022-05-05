package com.example.rupyzassignment.Model

import com.google.gson.annotations.SerializedName

data class DataX(
    @SerializedName("author")
    val author: String,
    @SerializedName("category")
    val category: String,
    @SerializedName("content")
    val content: String,
    @SerializedName("created_at")
    val created_at: String,
    @SerializedName("feature_image_url")
    val feature_image_url: String,
    @SerializedName("label")
    val label: Any,
    @SerializedName("read_time")
    val read_time: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("tags")
    val tags: List<Any>,
    @SerializedName("title")
    val title: String,
    @SerializedName("viewers_count")
    val viewers_count: Int
)