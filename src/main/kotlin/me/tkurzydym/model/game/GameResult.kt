package me.tkurzydym.model.game

import me.tkurzydym.model.player.Player

data class GameResult(val rounds: Int, val players: List<Player>)