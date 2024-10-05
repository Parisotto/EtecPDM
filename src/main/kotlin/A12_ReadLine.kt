// Aula 12: readln() (Ler uma linha de entrada

fun main() {
    var nome: String

    print("Digite seu nome: ")
    nome = readln()
    println("Seja bem-vindo $nome")

    print("Digite seu sobrenome: ")
    var sobrenome = readLine()
    println("Como vai $nome $sobrenome")

    print("Digite sua idade: ")
    var idade = readln()
    println("$sobrenome, você já tem $idade?")

    var numero: Int
    print("Digite um número inteiro: ")
    numero = readln().toInt()
    var outroNumero = readln()

    print("A soma de $numero e $outroNumero é ${numero + outroNumero.toInt()}")
}