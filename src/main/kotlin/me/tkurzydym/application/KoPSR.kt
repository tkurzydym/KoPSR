package me.tkurzydym.application

import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult

class KoPSR {

    fun playGame(rounds: Int): Int
    {
        var round = 1
        while(round < rounds)
        {
            round++
        }
        return round
    }


}
