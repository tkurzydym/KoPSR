package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult

object PaperActionMatcher : ActionMatcher {

    private val MATCHINGS: Map<GameAction, GameResult> = mapOf(
        GameAction.PAPER to GameResult.DRAW,
        GameAction.ROCK to GameResult.WIN,
        GameAction.SCISSOR to GameResult.LOSE
    )

    override fun match(other: GameAction): GameResult {
        return MATCHINGS.getValue(other)
    }
}