package me.tkurzydym.application.game

import me.tkurzydym.application.io.GameLog
import me.tkurzydym.model.game.GameResult
import me.tkurzydym.model.game.MatchResult
import me.tkurzydym.model.game.matchAgainst
import me.tkurzydym.model.player.Player

class KoPSR {

    fun playGame(rounds: Int, p1: Player, p2: Player): GameResult
    {
        val result = GameResult(rounds = rounds, players = listOf(p1, p2))

        var round = 0
        while(round < rounds)
        {
            playRound(p1, p2)
            round++
        }

        GameLog.printGameResult(result)

        return result
    }

    private fun playRound(p1: Player, p2: Player) {
        when(p1.capabilities.pickAction().matchAgainst(p2.capabilities.pickAction()))
        {
            MatchResult.WIN -> p1.apply { amountWins++ }
            MatchResult.DRAW -> p1.apply { amountDraws++ }
            MatchResult.LOSE -> p1.apply { amountLosses++ }
        }

    }
}
