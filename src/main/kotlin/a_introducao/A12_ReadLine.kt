package a_introducao// Aula 12: readLine() Ler uma linha de entrada

fun main() {
    print("Digite seu nome: ")

    var nome = readLine()
    println("Seja bem-vindo $nome")

    print("Digite sua idade: ")
    var idade = readln()
    println("$nome, você já tem $idade anos?")

    var numero: Int
    print("Digite um número inteiro: ")
    numero = readln().toInt()
    println("O dobro de $numero é ${numero * 2}")
}
