//Aula 15: Controle de Fluxo: Laço de Repetição "while()"

fun main() {
    var i =0

    while (true) {
        print("$i ")
        i++
        if(i == 10) break
    }
    println()

    while(i >= -5){
        print("$i ")
        i--
    }
    println()

    i = 0
    while (true){
        print("Tecle ENTER para continuar ou 0 (zero) para encerrar o app: ")
        var resposta = readln()
        if(resposta == "0") {
            println("Ok, estamos terminando...")
            break
        }
        println("Tudo bem, vamos continuar: ${++i}")
    }
    println()

    val str = "Kotlin"
    var contador = 0
    while (contador < str.length) {
        print("${str[contador]}")
        contador++
    }
    println()

    contador = str.length - 1
    while(contador >= 0) {
        print("${str[contador]}")
        contador--
    }
}