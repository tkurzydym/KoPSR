package me.tkurzydym.application.starter

import me.tkurzydym.application.game.KoPSR
import me.tkurzydym.model.player.Player
import me.tkurzydym.model.player.RandomPlayer
import me.tkurzydym.model.player.RockThrower

fun main() {
    val kopsr = KoPSR()
    kopsr.playGame(
        rounds =    100,
        p1 = Player(name = "Player1", capabilities = RandomPlayer()),
        p2 = Player(name = "Rockthrower", capabilities = RockThrower())
    )
}