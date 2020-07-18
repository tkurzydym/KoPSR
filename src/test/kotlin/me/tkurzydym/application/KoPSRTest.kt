package me.tkurzydym.application

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import me.tkurzydym.model.game.GameAction
import me.tkurzydym.model.game.GameResult
import me.tkurzydym.model.game.matchAgainstRock

class KoPSRTest : StringSpec( {

    val kopsr = KoPSR()

    "should play at least 100 rounds" {
        kopsr.playGame(100) shouldBe 100
    }
})