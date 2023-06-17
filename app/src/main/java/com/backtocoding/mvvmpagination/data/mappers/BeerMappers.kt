package com.backtocoding.mvvmpagination.data.mappers

import com.backtocoding.mvvmpagination.data.local.BeerEntity
import com.backtocoding.mvvmpagination.data.remote.BeerDto
import com.backtocoding.mvvmpagination.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = first_brewed,
        imageUrl = image_url
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = id,
        name = name,
        tagline = tagline,
        description = description,
        firstBrewed = firstBrewed,
        imageUrl = imageUrl
    )
}