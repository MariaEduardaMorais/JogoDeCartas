package tools

import java.io.*
import model.Carta

class LeitorCartas() {

    companion object {
        private var cartas: MutableList<Carta>? = null

        private fun lerCartasCSV(): List<String> {
            val filePath = listOf("cartas.csv", "SeuJoseBattleCardGame/cartas.csv")
                    .firstOrNull { File(it).exists() } ?: throw FileNotFoundException("Arquivo de cartas não encontrado.")

            return File(filePath).readLines().filter { it.isNotBlank() }
        }

        fun getCartas(): List<Carta> {
            if (cartas == null) {
                cartas = lerCartasCSV().map { Carta(it) }.toMutableList()
            }
            return cartas!!.toList()
        }

        fun entregandoCartas(baralho: List<Carta>): List<Carta> {
            if (cartas == null || cartas!!.isEmpty()) {
                throw IllegalStateException("Não há cartas suficientes para distribuir.")
            }

            val cartasDistribuidas = mutableListOf<Carta>()
            repeat(5) {
                val carta = cartas!!.removeAt(0)
                cartasDistribuidas.add(carta)
            }
            return cartasDistribuidas
        }

        fun pegarCarta(): Carta {
            if (cartas == null || cartas!!.isEmpty()) {
                throw IllegalStateException("Não há cartas disponíveis.")
            }

            val randomIndex = (0..<cartas!!.size).random()
            return cartas!!.removeAt(randomIndex)
        }

        fun removendoCarta(carta: Carta) {
            cartas?.removeIf { it.nome == carta.nome }
        }
    }
}
