package me.tkurzydym.application

import me.tkurzydym.model.game.GameResult
import me.tkurzydym.model.game.matchAgainstRock
import me.tkurzydym.model.player.Player

class KoPSR {

    fun playGame(rounds: Int, p1: Player): Int
    {
        var round = 0
        while(round < rounds)
        {
            playRoundAgainstRock(p1)
            round++
        }

        pintGameResult(rounds, p1)
        return round
    }

    private fun playRoundAgainstRock(p1: Player) {
        when(p1.capabilities.pickAction().matchAgainstRock())
        {
            GameResult.WIN -> p1.apply { amountWins++ }
            GameResult.DRAW -> p1.apply { amountDraws++ }
            GameResult.LOSE -> p1.apply { amountLosses++ }
        }

    }

    private fun pintGameResult(rounds: Int, p1: Player) {
        println("""
            Amount of Games played: $rounds
            
            The game between Player 1 and Player 2 resulted ${p1.amountDraws} times in a draw
            
            Game Results for Player 1 against Rock:
                Player 1 won ${p1.amountWins} times
                Sadly Player 1 also lost ${p1.amountLosses} times
            
            Game Results for Player 2 that always picked Rock:
                Player 2 won ${p1.amountLosses} times
                Player 2 lost ${p1.amountWins} times    
        """.trimIndent())
    }


}
