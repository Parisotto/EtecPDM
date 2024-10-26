// Aula 22: Sobre os parâmetros das funções: vararg

fun main() {
    // parOuImpar(9)
    // parOuImpar(7, 8)
    // parOuImpar(8, 9, 7)
    //    print("Digite um inteiro: ")
    //    parOuImpar(readln().toInt())
    parOuImparComVararg(8, 9, 5, 0, 13)
}

fun parOuImpar(numero: Int) {
    var par = numero % 2 == 0
    print("O número $numero é ")
    if (par) { println("par!") }
    else { println("ímpar!") }
}

fun parOuImpar(numero1: Int, numero2: Int, numero3: Int = 0) {
    var par = numero1 % 2 == 0
    print("O número $numero1 é ")
    if (par) { println("par!") }
    else { println("ímpar!") }

    par = numero2 % 2 == 0
    print("O número $numero2 é ")
    if (par) { println("par!") }
    else { println("ímpar!") }
}

fun parOuImparComVararg(vararg numeros: Int) {
    for (numero in numeros) {
        var par = numero % 2 == 0
        print("O número $numero é ")
        if (par) {
            println("par!")
        } else {
            println("ímpar!")
        }
    }
}