package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.GAMES] category.
 */
@Suppress("unused")
class Zelda internal constructor(fakerService: FakerService) : YamlFakeDataProvider<Zelda>(fakerService) {
    override val yamlCategory = YamlCategory.GAMES
    override val secondaryCategory: Category = Category.ofName("ZELDA")
    override val localUniqueDataProvider = LocalUniqueDataProvider<Zelda>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory, secondaryCategory)
    }

    fun games() = resolve("zelda", "games")
    fun characters() = resolve("zelda", "characters")
    fun locations() = resolve("zelda", "locations")
    fun items() = resolve("zelda", "items")
}
