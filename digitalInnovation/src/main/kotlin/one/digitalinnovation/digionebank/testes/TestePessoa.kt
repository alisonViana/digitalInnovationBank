package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val alison = Pessoa("Alison", "123.123.213-3")

    println(alison.nome)
    println(alison.cpf)
    alison.printInfos()
}