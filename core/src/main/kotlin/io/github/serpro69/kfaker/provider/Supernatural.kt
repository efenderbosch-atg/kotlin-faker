@file:Suppress("unused")

package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*
import io.github.serpro69.kfaker.provider.unique.LocalUniqueDataProvider
import io.github.serpro69.kfaker.provider.unique.UniqueProviderDelegate

/**
 * [FakeDataProvider] implementation for [YamlCategory.SUPERNATURAL] category.
 */
class Supernatural internal constructor(fakerService: FakerService) :
    YamlFakeDataProvider<Supernatural>(fakerService) {
    override val yamlCategory = YamlCategory.SUPERNATURAL
    override val localUniqueDataProvider = LocalUniqueDataProvider<Supernatural>()
    override val unique by UniqueProviderDelegate(localUniqueDataProvider)

    init {
        fakerService.load(yamlCategory)
    }

    fun character(): String = resolve("character")
    fun creature(): String = resolve("creature")
    fun weapon(): String = resolve("weapon")
}
