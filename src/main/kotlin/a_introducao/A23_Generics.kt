package a_introducao

import java.lang.String.format

// Aula 23: Parâmetro Generics <T>

fun main() {
    media(10.9, 8.4, 7.3)
    media("Edson", "r", 10.9, 8.4, 7.3)
}

fun <T> media(vararg notas: T) {
    var soma = 0.0
    var contador = 0
    for(n in notas) {
        if (n is Double) {
            soma += n
            contador += 1
        }
    }
    // println(a_introducao.soma / notas.size)
    println(format("A média é %.1f", soma / contador))
}

fun <T, F> media(nome: String, outro: F, vararg notas: T) {
    var soma = 0.0
    var contador = 0
    for (n in notas) {
        if(n is Double){
            soma += n
            contador += 1
        }
    }
    var tipo = ""
    if (outro == true) {
        tipo = "final"
    } else if (outro == false) {
        tipo = "parcial"
    }
    var media = soma / contador
    println(format("A média $tipo do aluno $nome é %.1f", media))
}
