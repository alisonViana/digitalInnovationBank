package one.digitalinnovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome, cpf, salario) {

    /*
        implementa a função declarada na classe supertipo Funcionario de acordo com
        suas características específicas
     */
    override fun calculoAuxilio() = salario * 0.1

}