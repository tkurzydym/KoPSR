package me.tkurzydym.application.game

import io.kotest.core.spec.BeforeTest
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import me.tkurzydym.application.game.KoPSR
import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult
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
        randPlayer = Player(randPlayerCapabilities, name = "RandomPlayer")
        rockthrower = Player(RockThrower(), name ="Rockthrower")
    }

    beforeTest(setup)

    "should play at least 100 rounds" {
        kopsr.playGame(100, randPlayer, rockthrower).rounds shouldBe 100
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

    "should return Result" {
        val p1 = Player(RandomPlayer(), name = "RandomPlayer")
        kopsr.playGame(10, p1, rockthrower) shouldBe GameResult(rounds= 10, players=listOf(p1, rockthrower))
    }

    "should count player 2 losses" {
        every { randPlayerCapabilities.pickAction() } returns GameAction.PAPER
        kopsr.playGame(1, randPlayer, rockthrower)
        rockthrower.amountLosses shouldBe 1
    }

    "should count player 2 draws" {
        every { randPlayerCapabilities.pickAction() } returns GameAction.ROCK
        kopsr.playGame(1, randPlayer, rockthrower)
        rockthrower.amountDraws shouldBe 1
    }

    "should count player 2 wins" {
        every { randPlayerCapabilities.pickAction() } returns GameAction.SCISSOR
        kopsr.playGame(1, randPlayer, rockthrower)
        rockthrower.amountWins shouldBe 1
    }

})