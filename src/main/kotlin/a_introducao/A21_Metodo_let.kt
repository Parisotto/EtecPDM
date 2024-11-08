package a_introducao

// Aula 21: Método ".let"
fun main() {
    val str: String? = "a_introducao.hello"

    if (str != null) {
        str.uppercase()
        str.length
        println("A variável 'str' contém $str")
    }

    str ?: println("A varável 'str' É $str!")

    str?.let {
        // Aqui dentro, a variável 'str' passa a ser 'it'
        println("A variável 'it' NÃO É nula: $it")
        println(it.uppercase())
        println(it.length)
        println(str.uppercase())
    }
}
