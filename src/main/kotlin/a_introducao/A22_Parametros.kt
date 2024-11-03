package a_introducao// Aula 22: Sobre os parâmetos das funções
import java.lang.String.format

fun main() {
    // print("Digite um inteiro: ")
    // parOuImpar(readln().toInt())
    // parOuImpar(8, 9, 7)
    // parOuImparComVararg(2, 4, 7, 9, 0, 1)

    val nome = "Edson"
    // val media = notas(nome, 9, 3, 4, 5, 9, 10, 10)
    // println(format("%.2f", media))
    println(format("%.1f", notas(nome, 7, 9, 7)))
}

fun parOuImpar(numero: Int){
    var par = numero % 2 == 0
    print("O número $numero é ")
    if (par) { println("par!") }
    else { println("impar!") }
}

fun parOuImpar(n1: Int, n2: Int, n3: Int = 0){
    var par = n1 % 2 == 0
    print("O número $n1 é ")
    if (par) { println("par!") }
    else { println("impar!") }

    par = n2 % 2 == 0
    print("O número $n1 é ")
    if (par) { println("par!") }
    else { println("impar!") }
}

fun parOuImparComVararg(vararg numeros: Int){
    for (numero in numeros) {
        print("O número $numero é ")
        if (numero % 2 == 0) {
            println("par!")
        } else {
            println("impar!")
        }
    }
}

fun notas(nome: String, vararg notas: Int): Double {
    print("\nO aluno $nome ficou com média: ")
    var soma = 0
    for (n in notas) {
        soma += n
    }
    val media = soma.toDouble() / notas.size
    return media
}