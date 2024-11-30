package a_introducao/*
    Aula 13: Exercícios de reforço
    Controle de Fluxo: "if" - Leitura de linha: "readln()" - Conversão para inteiro: "toInt()"
*/

// 1. Escreva uma rotina capaz de ler dois número inteiros maiores que zero que representam os lados de uma figura geométrica. Informar se formam um quadrado ou um retângulo (lados iguais). Considere que os algulos são retos.
fun quadrado(){
    print("Informe o valor da base: ")
    val base = readln().toInt()

    print("Informe o valor do lado: ")
    val lado = readln().toInt()

    if (base == lado) {
        println("É um quadrado.")
    } else {
        println("É um retângulo")
    }
}

// 2. Escreva um programa capaz de ler três números inteiros maires que zero que representam os lados de um triângulo. Informar se é um triângulo equilátero (todos os lados iguais), isósceles (apenas dois lados são iguais) ou escaleno (os trÊs lados são diferentes.
fun triangulo(){
    print("Informe o lado 1 do triângulo: ")
    val lado1 = readln().toInt()

    print("Informe o lado 2 do triângulo: ")
    val lado2 = readln().toInt()

    print("Informe o lado 3 do triângulo: ")
    val lado3 = readln().toInt()

    var tipo: String = "ESCALENO"
/*
    if (lado1 == lado2){
        if (lado2 == lado3){
            tipo = "equilátero"
        } else {
            tipo = "isósceles"
        }
    } else if (lado1 == lado3){
        tipo = "isósceles"
    } else if (lado2 == lado3) {
        tipo = "isósceles"
    } else {
        tipo = "escaleno"
    }

    if (lado1 == lado2 && lado1 == lado3){
        tipo = "equilátero"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipo = "isósceles"
    } else {
        tipo = "escaleno"
    }
*/
    if (lado1 == lado2 && lado1 == lado3){
        tipo = "EQUILÁTERO"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipo = "ISÓSCELES"
    }

    println("É um triângulo $tipo!")
}


fun main() {
    quadrado()
    triangulo()
}