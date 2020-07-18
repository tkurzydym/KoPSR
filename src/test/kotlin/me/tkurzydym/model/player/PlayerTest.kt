package me.tkurzydym.model.player

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class PlayerTest : StringSpec({
    "should have a name"{
        val player = Player(name= "Player1", capabilities = RockThrower())
        player.name shouldBe "Player1"
    }
})