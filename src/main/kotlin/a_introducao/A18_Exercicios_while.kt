package a_introducao

/*
    Aula 15: Exercícios de reforço
    Controle de Fluxo: while()
 */

// CONTROLE DE FLUXO - while()
fun main(){
    // a_introducao.litros3()
    // a_introducao.fizzBuzz()
    // a_introducao.inverter("Meu nome é Asdrúbal")
    println(contaXeO("xxxooo"))
}

// 1. Considere uma caixa d'água de 2 mil a_introducao.litros. Rômulo gostaria de encher a cahixa d'água com balões de 7 a_introducao.litros. Quantos balões cabem na caixa d'água sem que o volume seja excedido? Crie uma rotina usando while() que retorne a resposta.
fun litros(){
    var caixa = 2000
    var numBaloes = 0
    while(caixa >= 7){
        caixa -= 7
        numBaloes++
    }
    println("Cabem $numBaloes balões.")
}
fun litros2(){
    println("Cabem ${2000 / 7} balões.")
}

fun litros3(){
    var caixa = 2000
    var numBaloes = 0
    do {
        caixa-= 7
        numBaloes++
    } while (caixa >= 7)
    println("Cabem $numBaloes balões.")
}

/* 2. FizzBuzz
    Imprima os números de 1 a 50 em ordem a_introducao.crescente de acordo com a regra abaixo. Use while() ou do while()
        a. Quando um número for divisível por 3, imprimir Buzz.
        b. Quando um número for divisível por 5, imprimir Fizz.
        c. Quando um número for divisível por 3 e 5 simultaneamente, imprimir FizzBuzz
 */
fun fizzBuzz(){
    var i = 1
    do {
        if (i % 3 == 0 && i % 5 == 0){
            print("FizzBuzz ")
        } else if (i % 3 == 0){
            print("Buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    } while (i <= 50)
}

/* 3. Escreva um código, usando while() ou do while(), capaz de receber um texto e imprimí-lo invertido
      Exemplo de entrada: Meu nome é Asdrúbal
      Exemplo de saída esperada: labúrdsA é emon ueM
*/
fun inverter(texto: String) {
    // println(texto.reversed())
    var i = texto.length - 1
    do {
        print("${texto[i]}")
        i--
    } while (i >= 0)
}

// 4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de a_introducao.caracteres "x" e "o" e retorna true ou false. Caso não exista nem "x" nem "o", retornar false. Use while() ou do while()
fun contaXeO(texto: String): Boolean {
    var txt = texto.lowercase()
    var numX = 0
    var numO = 0

    var i = 0
    do {
        if (txt[i] == 'o') {
            numO++
        } else if (txt[i] == 'x') {
            numX++
        }
        i++
    } while (i < txt.length)

    return numX == numO && numX != 0
}
