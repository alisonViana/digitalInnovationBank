package one.digitalinnovation.digionebank

/*
    Data Class é utilizada para armazenar dados imutáveis
    ou seja, ela armazena as informações na inicialização, permitindo o objeto ter um estado
    e não possa ser modificado durante a aplicação. uma espécie de modelo fixo
 */

data class Banco(
    val nome: String,
    val numero: Int
){
    fun printInfo() = println("$nome - $numero")
}

