package me.tkurzydym.model.player

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import me.tkurzydym.model.game.GameAction

internal class RockthrowerTest : StringSpec( {

    val rockthrower = RockThrower()

    "A Rockthrower should always pick the Action ROCK"{
        rockthrower.pickAction() shouldBe GameAction.ROCK
    }

})