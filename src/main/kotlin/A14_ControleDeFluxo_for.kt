// Aula 14: A14_ControleDeFluxo_for.kt

fun main() {
    for(i in 1..10){
        print("$i ")
    }
    println()

    var str = "Kotlin é uma linguagem de programação."
    for(caractere in str) {
        print("$caractere,")
    }
    println()

    for(i in 0..20 step 3) print("$i ")
    println()

    for(valor in 20 downTo 0) print("$valor ")
    println()

    for(valor in 15 downTo 3 step 2) print("$valor ")
}