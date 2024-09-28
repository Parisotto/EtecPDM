/*
    Aula 4: Exercícios de reforço
    Variáveis, tipo de dados e operadores aritméticos
*/

// a. Crie um novo arquivo chamado A04_Exercicio.kt com uma função main.
fun main(){
    // b. Declare uma variável mutável capaz de armazenar seu nome completo.
    var nome = "Edson Luiz Parisotto"

    // c. Declare uma variável de texto sem valor algum.
    var texto: String

    // d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você calça
    val numero: Byte = 43

    // e. Declare uma variável capaz de armazenar o PIB do Brazil este ano de 2024 que é cerca de R$ 10.900.000.000.000,00 (R$ 10,9 trilhões)
    var PIB: Float = 10900000000000f
    val PIB2: Double = 10900000000000.0
    var PIB3: Long = 10900000000000

    // f. Declare uma variável capaz de armazenar a população do Brasil em 2024 que é cerca de 212.600.000 (212,6 milhões)
    var populacao: Int = 212600000

    // g. Imprima no terminal o valor do PIB per capita.
    println("O PIB per capita é R$ ${ PIB / populacao }")

    // h. Rode seu programa de forma que não possua erros de compilação ou execução.

}
