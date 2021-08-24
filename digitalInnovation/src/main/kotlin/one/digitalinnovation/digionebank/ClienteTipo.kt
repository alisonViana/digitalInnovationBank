package one.digitalinnovation.digionebank

/*
    enum é a representação do objeto em si
    permite a criação de objetos com informações já pré-definidas
 */

enum class ClienteTipo(val descricao: String, val codigo: Int) {
    /* objetos do tipo "ClienteTipo" */
    PF("Pessoa Física", 101),
    PJ("Pessoa Jurídica", 103)

    /*
        objeto que permite a criação de funções estáticas.
        acessadas via classe e não via instância do objeto
    */

}