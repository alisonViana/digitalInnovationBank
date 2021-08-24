package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pessoaPf = ClienteTipo.PF
    val pessoaPj = ClienteTipo.PJ

    println("${pessoaPf.name} - ${pessoaPf.descricao} (${pessoaPf.codigo})")
    println("${pessoaPj.name} - ${pessoaPj.descricao} (${pessoaPj.codigo})")
}