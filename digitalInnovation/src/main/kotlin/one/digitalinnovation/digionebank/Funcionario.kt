package one.digitalinnovation.digionebank

import java.math.BigDecimal

/*
    Iremos instanciar os funcionários apenas pelo seu tipo específico (subtipo),
    não mais instanciando por Pessoa ou Funcionario (supertipos), por isso o uso de abastract class
 */

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    /*
        protected - permite que apenas a classe Funcionario e as classes filhas
        possam fazer uso do membro
        abstract - remove a necessidade de implementação de corpo da função na classe abstrata,
        permitindo que cada subtipo possa fazer sua própria implementação de função
     */
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome: $nome
        CPF: $cpf
        Salário: R$ $salario
        Auxílio: R$ ${calculoAuxilio()}
    """.trimIndent()
}