package model

class Jogador(private val nome: String, var pontos: Int, private val baralho: List<Carta>, val personagens: MutableList<Personagens>) {
    override fun toString() = "$nome - $pontos - $baralho"
}

