package me.tkurzydym.model.player

import me.tkurzydym.model.game.GameAction

class RockThrower {
    fun pickAction(): GameAction {
        return GameAction.ROCK
    }
}
