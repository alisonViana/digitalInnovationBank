package one.digitalinnovation.digionebank

/*
    Iremos instanciar os funcionários apenas pelo seu tipo específico,
    não mais instanciando por Pessoa ou Funcionario, por isso o uso da classe abastract
 */

abstract class Pessoa(
    val nome: String,
    val cpf: String
)
