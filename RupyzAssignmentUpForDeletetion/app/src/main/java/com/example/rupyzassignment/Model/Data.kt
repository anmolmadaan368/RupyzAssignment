package com.example.rupyzassignment.Model

import com.google.gson.annotations.SerializedName

// TODO: use SerializedName for casting to response object
data class Data(
    @SerializedName("author")
    val author: String,
    @SerializedName("content")
    val blog_for: Any,
    @SerializedName("category")
    val category: String,
    @SerializedName("created_at")
    val created_at: String,
    @SerializedName("label")
    val label: Any,
    @SerializedName("feature_image_url")
    val promotion_image_url: String,
    @SerializedName("thumbnail_image_url")
    val thumbnail_image_url: String,
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