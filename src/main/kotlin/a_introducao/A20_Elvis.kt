package a_introducao// Aula 20: Operador Elvis ?:

fun main() {
    var str: String? = null
    if (str == null) {
        println("A variável é nula")
    } else {
        println(str)
    }

    println(str ?: "Ok. Segundo Elvis, a variável 'str' é nula")
    println(str ?: 7)
    var teste = str ?: true
    println(teste)
    println(str ?: nulidade())
    str ?: println(nulidade())
}

fun nulidade(): String {
    return "Sim! É nula!"
}
