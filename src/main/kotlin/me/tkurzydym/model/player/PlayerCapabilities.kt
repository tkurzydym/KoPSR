package me.tkurzydym.model.player

import me.tkurzydym.model.game.GameAction

interface PlayerCapabilities {
    fun pickAction() : GameAction
}