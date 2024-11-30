package a_introducao// Aula 21: Método ".let"

fun main() {
    // val str: String? = null
    val str: String? = "hello"

    if (str != null){
        str.uppercase()
        str.length
        println("\\\\ Á variável 'str' contém \"$str\" \\")
    }

    str?.let {
        // Aqui dentro, a variável 'str' passa a ser 'it'
        println("A variável $it NÃO é nula")
        println(it.uppercase())
        println(it.length)
    }

    str ?: println("A variável $str É nula!")
}
