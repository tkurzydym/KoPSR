package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult

interface ActionMatcher {
    fun match(other: GameAction): GameResult
}