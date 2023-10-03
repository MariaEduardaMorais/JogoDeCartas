package model

class Tabuleiro(private val player: Jogador, private val monstros: MutableList<Personagens> = mutableListOf()) {
    override fun toString(): String = "$monstros - $player"
}
