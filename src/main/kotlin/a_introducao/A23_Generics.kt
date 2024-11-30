package a_introducao// Aula 23: Parâmetro generics <T>
//import oo.Inutil -> private aula A33
import java.lang.String.format

fun main(){
    media(4, 3.5, 9)
    media("Edson", false, 7.5, 9, 7, 8.3)
}

fun <T> media(vararg notas: T) {
    var soma = 0.0
    for (n in notas) {
        if(n is Double) soma += n
    }
    println(format("\nA média é %.1f", soma / notas.size))
}

fun <T, F> media(nome: String, final: F, vararg notas: T): Unit {
    var soma = 0.0
    var media = ""

    for (n in notas) {
        if(n is Double) soma += n
    }

    if (final == true) media = "final" else  media = "parcial"

    println(format("\nA média $media do aluno $nome é %.1f", soma / notas.size))
    //Inutil() -> private na aula A33
}
