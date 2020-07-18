package me.tkurzydym.model.game

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

internal class GameActionTest: StringSpec({
    "paper should win against rock" {
        GameAction.PAPER.matchAgainst(GameAction.ROCK) shouldBe MatchResult.WIN
    }

    "rock should draw against rock" {
        GameAction.ROCK.matchAgainst(GameAction.ROCK) shouldBe MatchResult.DRAW
    }

    "scissor should lose against rock" {
        GameAction.SCISSOR.matchAgainst(GameAction.ROCK) shouldBe MatchResult.LOSE
    }
})