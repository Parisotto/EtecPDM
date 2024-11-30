package a_introducao// Aula 10: Operadores de Comparação e igualdade, Operadores Lógico e Operador de intervalo

fun main(){
    // Operadores de Comparação e igualdade: >, <, >=, <=
    var n = 7

    if (n > 5) println("$n é maior que 5")
    if (n < 9) println("$n é menor que 4")
    if (n >= 6) println("$n é maior ou igual a 7")
    if (n <= 7) println("$n é menor ou igual a 7")

    // Operadores de Igualdade: ==, != (diferente), ! (negação)
    if (n == 7) println("$n é igual a 7")
    if (n != 9) println("$n é diferente de 9")
    if (!(n == 9)) println("$n não é igual de 9")

    // Operadores Lógico: Conjunção && (e, and), Disjunção || (ou, or)
    if (n > 3 && n < 10 ) println("$n é maior que 3 e menor que 10")
    if (n > 11 || n < 8) println("$n não é maior que 11 mas é menor que 8")

    // Operador de Intervalo (range): in
    if (n >= 2 && n <= 15) {println("$n está entre o intervalo de 2 a 15, inclusive")}
    if (n in 2..15) {println("$n está entre o intervalo de 2 a 15, inclusive")}
}

