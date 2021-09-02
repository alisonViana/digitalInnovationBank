package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria José", "784.784.845-5", 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}
