package me.tkurzydym.application.actionmatcher

import me.tkurzydym.model.game.GameAction

object ActionMatcherFactory {
    fun build(action: GameAction): ActionMatcher
    {
        return when(action){
            GameAction.PAPER -> PaperActionMatcher
            GameAction.SCISSOR -> ScissorActionMatcher
            GameAction.ROCK -> RockActionMatcher
        }
    }
}