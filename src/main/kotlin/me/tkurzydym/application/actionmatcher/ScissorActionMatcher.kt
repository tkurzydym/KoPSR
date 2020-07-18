package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult

object ScissorActionMatcher : ActionMatcher {

    private val MATCHINGS = mapOf(
        GameAction.PAPER to GameResult.WIN,
        GameAction.ROCK to GameResult.LOSE,
        GameAction.SCISSOR to GameResult.DRAW
    )

    override fun match(other: GameAction): GameResult {
        return MATCHINGS.getValue(other)
    }
}