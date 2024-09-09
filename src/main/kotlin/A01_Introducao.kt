// Aula 1: Primeiro contato

fun main() {
    println("Olá, mundo!")

    print("Edson")
    print(" ")
    print("Parisotto")

    println()

    var nome = "Edson\nLuiz\nParisotto"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Edson"
    print("Olá, " + nome + "\n")

    var sobrenome = "Parisotto"
    println("Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir!"

    val nomeCompleto = nome + " Luiz " + sobrenome
    println(nomeCompleto)
    println("$variavelEstatica, ${nomeCompleto}!")
}
