package me.tkurzydym.model.game

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

internal class GameActionTest: StringSpec({
    "paper should win against rock" {
        GameAction.PAPER.matchAgainstRock() shouldBe GameResult.WIN
    }

    "rock should draw against rock" {
        GameAction.ROCK.matchAgainstRock() shouldBe GameResult.DRAW
    }

    "scissor should lose against rock" {
        GameAction.SCISSOR.matchAgainstRock() shouldBe GameResult.LOSE
    }
})