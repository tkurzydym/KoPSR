package me.tkurzydym.application.actionmatcher

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.MatchResult

internal class ScissorActionMatcherTest : StringSpec({
    "should lose against Rock" {
        ScissorActionMatcher.match(GameAction.ROCK) shouldBe MatchResult.LOSE
    }

    "should win against Paper" {
        ScissorActionMatcher.match(GameAction.PAPER) shouldBe MatchResult.WIN
    }

    "should draw against Scissor" {
        ScissorActionMatcher.match(GameAction.SCISSOR) shouldBe MatchResult.DRAW
    }
})