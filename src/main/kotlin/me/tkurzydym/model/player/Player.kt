package me.tkurzydym.model.player

import me.tkurzydym.model.game.GameAction

interface Player {
    fun pickAction() : GameAction
}