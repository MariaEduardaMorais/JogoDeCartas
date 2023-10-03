package model

class Artefatos(private val nome: String, private val descricao: String, private val ataque: Int, private val defesa: Int) {
    override fun toString() = "$nome - $descricao - $ataque - $defesa"
}