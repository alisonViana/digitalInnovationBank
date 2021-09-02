package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
) : Pessoa(nome, cpf), Logavel {

    override fun login() = "123abc" == senha

    override fun toString() = """
        Nome: $nome
        CPF:  $cpf
        Tipo: ${clienteTipo.descricao} (cod: ${clienteTipo.codigo })
    """.trimIndent()
}