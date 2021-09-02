package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val isaac = Cliente("Isaac", "255.255.255-0", ClienteTipo.PF, "123abc")

    println(isaac.toString())
    TesteAutenticacao().autentica(isaac)
}