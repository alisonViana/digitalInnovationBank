package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)
    digiOneBank.printInfo()

    /* criando uma cópia do objeto do tipo data class */
    val digiBank = digiOneBank.copy("digiTwo")
    digiBank.printInfo()
}

/*
enum é a representação do objeto em si
 */