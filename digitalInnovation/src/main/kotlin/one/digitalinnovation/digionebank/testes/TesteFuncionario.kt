package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val joao = Funcionario("João Rodrigues", "784.784.845-5", BigDecimal.valueOf(2500.0))
    joao.printInfos()
    println(joao.salario)
}