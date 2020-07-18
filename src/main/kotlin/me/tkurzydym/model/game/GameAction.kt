package me.tkurzydym.model.game

import kotlin.random.Random

enum class GameAction{
    PAPER,
    SCISSOR,
    ROCK;
}

fun GameAction.matchAgainstRock() : GameResult {
    return when(this){
        GameAction.PAPER -> GameResult.WIN
        GameAction.SCISSOR -> GameResult.LOSE
        GameAction.ROCK -> GameResult.DRAW
    }
}
