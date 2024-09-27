// Aula 14: Controle de Fluxo: Laço de repetição "for()"

fun main() {
    for (i in 1..10){
        print("$i ")
    }
    println()

    val str = "Kotlin é uma linguagem de programação."
    for (caracter in str) {
        print(caracter)
    }
    println()

    for (i in 0..20 step 2) print("$i ")
    println()

    for (valor in 20 downTo 0) print("$valor ")
    println()

    for (valor in 20 downTo 0 step 3) print("$valor ")
}