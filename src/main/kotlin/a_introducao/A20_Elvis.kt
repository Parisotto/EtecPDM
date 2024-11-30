package a_introducao// Aula 20: Operador Elvis: ?

fun main() {
    val str: String? = null

    if (str == null){
        println("A variável 'str' é nula")
    } else {
        println(str)
    }

    println(str ?: "Ok. Segundo Elvis, a variável 'str' é nula")
    println(str ?: 7)
    println(str ?: true)
    println(str ?: nulidade())
    str ?: println(nulidade())
}

fun nulidade(): String{
    return "Sim! É nula!"
}