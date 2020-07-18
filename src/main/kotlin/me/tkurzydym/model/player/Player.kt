package me.tkurzydym.model.player

data class Player(
    val capabilities: PlayerCapabilities,
    var amountWins: Int = 0,
    var amountDraws: Int = 0,
    var amountLosses: Int = 0
)