package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.MatchResult

interface ActionMatcher {
    fun match(other: GameAction): MatchResult
}