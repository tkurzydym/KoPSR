package me.tkurzydym.model.player

import me.tkurzydym.model.game.GameAction

class RockThrower : PlayerCapabilities {
    override fun pickAction(): GameAction {
        return GameAction.ROCK
    }
}
