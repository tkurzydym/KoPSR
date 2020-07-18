package me.tkurzydym.application.actionmatcher

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult

internal class PaperActionMatcherTest : StringSpec({
    "should win against Rock" {
        PaperActionMatcher.match(GameAction.ROCK) shouldBe GameResult.WIN
    }

    "should draw against Paper" {
        PaperActionMatcher.match(GameAction.PAPER) shouldBe GameResult.DRAW
    }

    "should lose against Scissor" {
        PaperActionMatcher.match(GameAction.SCISSOR) shouldBe GameResult.LOSE
    }
})