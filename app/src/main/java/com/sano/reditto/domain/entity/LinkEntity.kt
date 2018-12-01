package com.sano.reditto.domain.entity

class LinkEntity(
    val title: String,
    val author: String,
    val subreddit: String,
    val postDate: Long,
    val thumbnail: String?,
    val score: Int,
    val numComments: Int
)