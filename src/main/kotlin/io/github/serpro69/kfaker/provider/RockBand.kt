package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.ROCK_BAND] category.
 */
@Suppress("unused")
class RockBand internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<RockBand>(fakerService) {
    override val categoryName = CategoryName.ROCK_BAND
    override val unique by UniqueProviderDelegate(uniqueDataProvider)

    fun name() = resolve("name")
}
