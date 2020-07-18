package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.MatchResult

class RockActionMatcher : ActionMatcher {

    private val matchings = mapOf(
        GameAction.PAPER to MatchResult.LOSE,
        GameAction.ROCK to MatchResult.DRAW,
        GameAction.SCISSOR to MatchResult.WIN
    )

    override fun match(other: GameAction): MatchResult {
        return matchings.getValue(other)
    }
}