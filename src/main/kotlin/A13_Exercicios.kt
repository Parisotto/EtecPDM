/*
    Aula 13: Exercícios de reforço
    - Controle de fluxo: "if()"
    - Leitura de linha: "readln()
    - Conversão de inteiro: "toInt()"
 */
fun main() {
    // quadrado()
    triangulo()
}

// 1. Escreva uma rotina capaz de ler dois números inteiros maiores que zero que representam os lados de uma figura geométrica quadrada ou retangular. Informar se é um quadrado ou retangulo.
fun quadrado(){
    var lado1: Int
    var lado2: Int

    print("Digite um número inteiro: ")
    lado1 = readln().toInt()

    print("Digite outro número inteiro: ")
    lado2 = readln().toInt()

    if (lado1 == lado2) {
        println("É um quadrado!")
    } else {
        println("É um retângulo!")
    }
}

// 2. Escreva uma função capaz de ler três números inteiros maiores que zero que representam os lados de um triângulo. Informar se é um triângulo equilátero (todos os lados iguais), isósceles (apenas dois lados são iguais) ou escaleno (os trÊs lados são diferentes.
fun triangulo(){
    var lado1: Int
    var lado2: Int
    var lado3: Int

    print("Digite o primeiro lado: ")
    lado1 = readln().toInt()

    print("Digite o segundo lado: ")
    lado2 = readln().toInt()

    print("Digite o terceiro lado: ")
    lado3 = readln().toInt()

    var tipo: String
/*
    if (lado1 == lado2) {
        if (lado1 == lado3){
            tipo = "equilátero"
        } else {
            tipo = "isósceles"
        }
    } else if (lado1 == lado3) {
        tipo = "isósceles"
    } else if (lado2 == lado3) {
        tipo = "isosceles"
    } else {
        tipo = "escaleno"
    }
*/
    /*
    if (lado1 == lado2 && lado1 == lado3) {
        tipo = "equilátero"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipo = "isósceles"
    } else {
        tipo = "escaleno"
    }
*/

    tipo = "ESCALENO"
    if (lado1 == lado2 && lado1 == lado3) {
        tipo = "EQUILÁTERO"
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipo = "ISÓSCELES"
    }

    println("É um triângulo $tipo")
}
