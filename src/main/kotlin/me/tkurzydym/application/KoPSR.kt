package me.tkurzydym.application

import me.tkurzydym.model.game.GameResult
import me.tkurzydym.model.game.matchAgainstRock
import me.tkurzydym.model.player.Player
import me.tkurzydym.model.player.PlayerCapabilities

class KoPSR {

    fun playGame(rounds: Int, p1: Player): Int
    {
        var round = 0
        while(round < rounds)
        {
            playRound(p1)
            round++
        }
        return round
    }

    private fun playRound(p1: Player) {
        when(p1.capabilities.pickAction().matchAgainstRock())
        {
            GameResult.WIN -> p1.apply { amountWins++ }
            GameResult.DRAW -> p1.apply { amountDraws++ }
            GameResult.LOSE -> TODO()
        }

    }


}
