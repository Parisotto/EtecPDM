/*
    Aula 15: Exercícios de reforço
    Controle de Fluxo: while()
 */

// CONTROLE DE FLUXO - while()
fun main(){
    litros3()
}

// 1. Considere uma caixa d'água de 2 mil litros. Rômulo gostaria de encher a cahixa d'água com balões de 7 litros. Quantos balões cabem na caixa d'água sem que o volume seja excedido? Crie uma rotina usando while() que retorne a resposta.
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
    Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo. Use while() ou do while()
        a. Quando um número for divisível por 3, imprimir Buzz.
        b. Quando um número for divisível por 5, imprimir Fizz.
        c. Quando um número for divisível por 3 e 5 simultaneamente, imprimir FizzBuzz
 */

/* 3. Escreva um código, usando while() ou do while(), capaz de receber um texto e imprimí-lo invertido
      Exemplo de entrada: Meu nome é Asdrúbal
      Exemplo de saída esperada: labúrdsA é emon ueM
*/

// 4. Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres "x" e "o" e retorna true ou false. Caso não exista nem "x" nem "o", retornar false. Use while() ou do while()

