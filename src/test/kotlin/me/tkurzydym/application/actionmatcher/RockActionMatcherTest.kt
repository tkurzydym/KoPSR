package me.tkurzydym.application.actionmatcher

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult

internal class RockActionMatcherTest : StringSpec({
    "should draw against Rock" {
        RockActionMatcher.match(GameAction.ROCK) shouldBe GameResult.DRAW
    }

    "should lose against Paper" {
        RockActionMatcher.match(GameAction.PAPER) shouldBe GameResult.LOSE
    }

    "should win against Scissor" {
        RockActionMatcher.match(GameAction.SCISSOR) shouldBe GameResult.WIN
    }
})