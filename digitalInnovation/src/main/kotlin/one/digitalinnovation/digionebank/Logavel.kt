package one.digitalinnovation.digionebank

/*
    - no exemplo em questão, a interface pode ser utilizada tanto por clientes quanto funcionários
    - força a implementação de suas funções nas classes específicas
    - toda interface já é abstrata
    - não tem construtor
    - Não seria possível para Cliente e Gerente herdar uma segunda classe "TesteAutenticacao".
     Assim, ao invés de herdar a classe diretamente eles utilizam a interface para fazer a ligação
     com ela. No caso, a interface força a implementação da função "login()" que é utilizada pela
     classe "TesteAutenticacao" para verificar a senha.
 */
interface Logavel {
    fun login(): Boolean
}