package me.tkurzydym.model.player

import me.tkurzydym.model.game.GameAction
import kotlin.random.Random

class RandomPlayer {
    fun pickAction() : GameAction {
        return enumValues<GameAction>()[Random.nextInt(0, 3)]
    }
}
