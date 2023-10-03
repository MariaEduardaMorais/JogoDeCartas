package model

class Personagens(private val nome: String, private val descricao: String, private var ataque: Int, private var defesa: Int, private var modo: String? = null) {
    override fun toString() = "$nome - $descricao - $ataque - $defesa - $modo"
}
