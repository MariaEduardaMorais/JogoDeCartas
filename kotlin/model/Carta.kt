package model

import kotlin.text.buildString as buildString1

class Carta(s: String) {
    val nome: String
    val descricao: String
    val ataque: Int
    val defesa: Int
    val categoria: String

    init {
        val espacos = s.split(buildString1 {
            append(";")
        })
        require(espacos.size == 5) { "A string deve conter 5 espaços separados por ';'." }

        nome = espacos[0]
        descricao = espacos[1].trim()
        ataque = espacos[2].toInt()
        defesa = espacos[3].toInt()
        categoria = espacos[4]
    }

    override fun toString() = "$nome - $descricao - $ataque - $defesa - $categoria"
}

