package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Alison"
    var cpf: String = "123.123.123-3"
}

fun main() {
    val alison = Pessoa()

    println(alison.nome)
    println(alison.cpf)

}