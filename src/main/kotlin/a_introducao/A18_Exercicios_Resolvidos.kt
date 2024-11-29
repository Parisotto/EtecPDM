package a_introducao/*
    Aula 18: Exercícios de reforço
    Controle de Fluxo: for(), while(), do while(), continue, break
 */

fun main() {
    //crescente()
    //decrescente()
    //excetoM5()
    //soma()
    //escada()
    //escada(5)
    //litros()
    //litros2()
    //fizzBuzz()
    //inverter("Meu nome é Asdrúbal")
    println(contaXeO("xxxooo")) // true
    println(contaXeO("xxXxoooO"))  // true
    println(contaXeO("xaobocx")) // true
    println(contaXeO("xxxo")) // false
    println(contaXeO("abcdef")) // false
    println(contaXeO(" ")) // false
}

// CONTROLE DE FLUXO - for()

// 1. Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
//      1 2 3 4 5 6 7 8 9 10 ....... 49 50. Use for()
fun crescente(){
    for(i in 1..50){
        print("$i ")
    }
}

// 2. Imprima os números de 1 a 50 na mesma linha em ordem decrescente usando for(). Saída esperada:
//      50 49 48 47 46 45 ......... 3 2 1
fun decrescente(){
    for (i in 50 downTo 1){
        print("$i ")
    }
}

// 3. Usando a resolução do exercício 1, NÃO imprima os números múltiplos de 5. Use for()
fun excetoM5(){
    for (i in 1..50){
        if (i % 5 != 0){
            print("$i ")
        }
    }
}

fun excetoM5a(){
    for (i in 1..50){
        if(i % 5 == 0){
            continue
        }
        println("$i ")
    }
}

// 4. Faça a soma de todos os números no intervalo de 1 a 500 usando. Ao final imprima o valor da soma.
fun soma(){
    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    println(soma)
}

/* 5. Escreva um programa capaz de receber um número inteiro n e imprimir uma escada de tamanho n usando o caracter cerquilha (#). Use for()
      Exemplo: se a entrada for 5, teremos:
            #
            ##
            ###
            ####
            #####
 */
fun escada(n: Int){
    for (i in 1..n) {
        for (j in 1..i){
            print("#")
        }
        println()
    }
}

// CONTROLE DE FLUXO while() e do while()

// 1. Considere uma caixa d'água de 2 mil litros. Rômulo gostaria de encher a caixa d'água com balões de água de 7 litros. Quantos balões cabem na caixa d'água sem que o volume seja excedido? Crie uma rotina usando while() ou do while() que retorne a resposta.
fun litros(){
    var caixa = 2000
    var numBaloes = 0
    do {
        caixa -= 7
        numBaloes++
    } while (caixa >= 7)
    println("Cabem $numBaloes balôes.")
}

fun litros2(){
    println("Cabem ${2000 / 7} balões!")
}

/* 2. FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo. Use while() ou do while()
      a. Quando um número for divisível por 3, imprimir Buzz.
      b. Quando um número for divisível por 5, imprimir Fizz.
      c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz
 */
fun fizzBuzz() {
    var i = 1
    do {
        if (i % 3 == 0 && i % 5 == 0){
            print("FizzBuzz ")
        } else if (i % 3 == 0){
            print("Buzz ")
        } else if (i % 5 == 0){
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
fun inverter(texto:String){
    //println(texto.reversed())
    var i = texto.length - 1
    do {
        print("${texto[i]}")
        i--
    } while (i >= 0)
}

/* 4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres "x" e "o" e retorna true ou false. Caso não exista nem "x" nem "o", retornar false. Use while() ou do while()
 */
fun contaXeO(texto: String): Boolean {
    var txt = texto.lowercase()
    var numX = 0
    var numO = 0

    var i = 0
    do {
        if (txt[i] == 'x'){
            numX++
        } else if (txt[i] == 'o'){
            numO++
        }
        i++
    } while (i < txt.length)
/*
    if (numX == numO && numX != 0) {
        return true
    } else {
        return false
    }
 */
    return numX == numO || numX != 0
}
