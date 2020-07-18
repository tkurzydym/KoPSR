package me.tkurzydym.model.game

import me.tkurzydym.application.actionmatcher.*

enum class GameAction{
    PAPER,
    SCISSOR,
    ROCK;
}

fun GameAction.matchAgainst(other: GameAction) : MatchResult {
    return ActionMatcherFactory.build(this).match(other)
}
