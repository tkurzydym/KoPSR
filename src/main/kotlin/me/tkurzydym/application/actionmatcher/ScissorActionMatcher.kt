package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.MatchResult

class ScissorActionMatcher : ActionMatcher {

    private val matchings = mapOf(
        GameAction.PAPER to MatchResult.WIN,
        GameAction.ROCK to MatchResult.LOSE,
        GameAction.SCISSOR to MatchResult.DRAW
    )

    override fun match(other: GameAction): MatchResult {
        return matchings.getValue(other)
    }
}