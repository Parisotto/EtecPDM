// Aula 23: Parâmetro Generics <T>

fun main() {
    // media(10.0, 8.0, 2000)

    media("Edson", "r", 7.0, 9.0, 8.0)
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
    // println(soma / notas.size)
    println(soma / contador)
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
    println("A média $tipo do aluno $nome é $media")
}
