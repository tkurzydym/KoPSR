package me.tkurzydym.application

import io.kotest.core.spec.BeforeTest
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.player.Player
import me.tkurzydym.model.player.RandomPlayer
import me.tkurzydym.model.player.RockThrower

class KoPSRTest : StringSpec({

    val randPlayerCapabilities: RandomPlayer = mockk()
    every { randPlayerCapabilities.pickAction() } returns GameAction.PAPER

    val kopsr = KoPSR()

    lateinit var randPlayer: Player
    lateinit var rockthrower: Player

    val setup: BeforeTest = {
        randPlayer = Player(randPlayerCapabilities)
        rockthrower = Player(RockThrower())
    }

    beforeTest(setup)

    "should play at least 100 rounds" {
        kopsr.playGame(100, randPlayer, rockthrower) shouldBe 100
    }

    "should let two random player compete against each other" {
        kopsr.playGame(1, randPlayer, rockthrower)
        randPlayer.amountWins shouldBe 1
    }

    "should also end a round in a draw" {
        every { randPlayerCapabilities.pickAction() } returns GameAction.ROCK
        kopsr.playGame(1, randPlayer, rockthrower)
        randPlayer.amountDraws shouldBe 1
    }

    "should also end a round in a loss" {
        every { randPlayerCapabilities.pickAction() } returns GameAction.SCISSOR
        kopsr.playGame(1, randPlayer, rockthrower)
        randPlayer.amountLosses shouldBe 1
    }

    "should print out Results" {
        val trueRandomPlayer = Player(RandomPlayer())
        kopsr.playGame(50, trueRandomPlayer, rockthrower)
    }
})