package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.MatchResult

class PaperActionMatcher : ActionMatcher {

    private val MATCHINGS: Map<GameAction, MatchResult> = mapOf(
        GameAction.PAPER to MatchResult.DRAW,
        GameAction.ROCK to MatchResult.WIN,
        GameAction.SCISSOR to MatchResult.LOSE
    )

    override fun match(other: GameAction): MatchResult {
        return MATCHINGS.getValue(other)
    }
}