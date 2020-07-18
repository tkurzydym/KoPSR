package me.tkurzydym.model.player

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldBeLargerThan
import io.kotest.matchers.collections.shouldBeOneOf
import io.kotest.matchers.collections.shouldContainAnyOf
import io.kotest.matchers.ints.shouldBeGreaterThan
import me.tkurzydym.model.game.GameAction

internal class RandomPlayerTest: StringSpec({
    val randPlayer = RandomPlayer()

    "should pick random GameAction"{
        randPlayer.pickAction() shouldBeOneOf listOf(GameAction.ROCK, GameAction.SCISSOR, GameAction.PAPER)
    }

    "should not be always the same" {
        val set: MutableSet<GameAction> = mutableSetOf()
        for(i in 0..10)
        {
            set.add(randPlayer.pickAction())
        }
        set.size shouldBeGreaterThan 1
    }
})