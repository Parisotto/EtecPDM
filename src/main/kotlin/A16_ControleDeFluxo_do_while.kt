// Aula 16: Controle de Fluxo: Laço de repetição "do while()"

fun main() {
    var contador = 0
    do {
        print("${++contador}, ")
    } while (contador <= 10)
    println()

    var c = 1
    do {
        print("${c++}, ")
    } while (c == 0)

    var i = 1
    while (i == 0){
        print("Nunca vai entrar aqui!")
    }
    println()

    do {
        print("Qual é o seu nome?: ")
        val nome = readln()
        if (nome != "") {
            println("Olá, $nome!")
        }
    } while (nome == "")
}