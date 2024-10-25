// Aula 23: Parâmetro generics <T>
import java.lang.String.format

fun main(){
    media("Edson", true, 7.5, 9, 7, 8.3)
}

fun <T, F> media(nome: String, final: F, vararg notas: T): Unit {
    var soma = 0.0
    for (n in notas) {
        if(n is Double) soma += n
    }
    println(format("\nA média é %.1f", soma / notas.size))
}