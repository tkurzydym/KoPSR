package me.tkurzydym.application.io

import me.tkurzydym.model.game.GameResult

object GameLog {

    fun printGameResult(result: GameResult) {

        println(
            """
                Amount of Games played: ${result.rounds}
                The winner of the Game is: ${result.players.maxBy { it.amountWins }!!.name}
                This game was held between ${result.players.joinToString(separator = " and ") { it.name }}
            
            """.trimIndent()
        )

        result.players.forEach {
            println(
                """
                    Game Results for ${it.name}:
                        ${it.name} won ${it.amountWins} times
                        Sadly ${it.name} also lost ${it.amountLosses} times
                
                """.trimIndent()
            )
        }
    }

}