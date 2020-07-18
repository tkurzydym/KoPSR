package me.tkurzydym.model.player

import me.tkurzydym.model.game.GameAction

class RockThrower : Player {
    override fun pickAction(): GameAction {
        return GameAction.ROCK
    }
}
