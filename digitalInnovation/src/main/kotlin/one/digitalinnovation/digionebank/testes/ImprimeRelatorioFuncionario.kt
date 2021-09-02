package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    /*
        companion object é um metodo estático no qual é possível invocá-lo via classe
        e não via instância
     */
    companion object{
        fun imprime(funcionario: Funcionario) = println(funcionario.toString())
    }
}