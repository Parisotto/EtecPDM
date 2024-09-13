// Aula 1: Primeiro contato

fun main() {
    println("1. Olá, mundo!")

    print("2. Edson")
    print(" ")
    print("Parisotto")

    println()

    var nome = "3. Edson\nLuiz\nParisotto"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Edson" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "Parisotto"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " Luiz " + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}
