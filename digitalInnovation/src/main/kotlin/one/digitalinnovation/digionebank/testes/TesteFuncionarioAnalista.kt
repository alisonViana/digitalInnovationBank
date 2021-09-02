package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("João Rodrigues", "784.784.845-5", 2500.0)

    ImprimeRelatorioFuncionario.imprime(joao)
}