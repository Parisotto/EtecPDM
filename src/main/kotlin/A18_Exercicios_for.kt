/*
    Aula 15: Exercícios de reforço
    Controle de Fluxo: for()
 */

// CONTROLE DE FLUXO - for()
fun main() {
    // crescente()
    // decrescente()
    // excetoM5()
    // somaSequencia()
    // escada(5)
    escadaIvertida(7)
}


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
    for(i in 50 downTo 1){
        print("$i ")
    }
}

// 3. Usando a resolução do exercício 1, não imprima os números múltiplos de 5. Use for()
fun excetoM5(){
    for(i in 1..50){
        if(i % 5 != 0){
            print("$i ")
        }
    }
}

fun excetoM5Continue(){
    for (i in 1..50){
        if(i % 5 == 0){
            continue
        }
        println("$i ")
    }
}

// 4. Faça a soma de todos os números no intervalo de 1 a 500. Ao final imprima o valor da soma.
fun somaSequencia(){
    var soma = 0
    for (i in 1..500){
        // soma = soma + i
        soma += i
    }
    println(soma)
}

/* 5. Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando o caracter cerquilha (#). Use for()
      Exemplo: se a entrada for 5, teremos:
            #
            ##
            ###
            ####
            #####
 */
fun escada(n: Int){
    for (i in 1..n){
        for (j in 1..i){
            print("#.")
        }
        println()
    }
}

fun escadaIvertida(n: Int){
    for (i in n downTo 1){
        for (j in 1..i){
            print("#.")
        }
        println()
    }
}
