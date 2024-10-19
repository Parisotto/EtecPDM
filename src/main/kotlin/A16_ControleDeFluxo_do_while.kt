// Aula 16: Controle de Fluxo: do while()

fun main() {
    var contador = 0
    do {
        print("${++contador}, ")
    } while (contador <= 10)
    println()

    var resp = ""
    do {
        print("Digite s para continuar: ")
        resp = readln()
        println("Vamos lá!")
    } while (resp == "s")

    var c = 1
    do{
        print("${c++}, ")
    } while (c == 0)

    var i = 1
    while (i == 0){
        print("Nunca vai entar aqui!")
    }
    println()

    do {
        print("Qual é o seu nome?: ")
        val nome = readln()
        if(nome != "") {
            println("Olá, $nome!")
        }
    } while (nome == "")
}