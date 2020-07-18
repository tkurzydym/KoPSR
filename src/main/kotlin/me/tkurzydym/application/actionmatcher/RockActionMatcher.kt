package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult

object RockActionMatcher : ActionMatcher {

    private val MATCHINGS = mapOf(
        GameAction.PAPER to GameResult.LOSE,
        GameAction.ROCK to GameResult.DRAW,
        GameAction.SCISSOR to GameResult.WIN
    )

    override fun match(other: GameAction): GameResult {
        return MATCHINGS.getValue(other)
    }
}