package a_introducao// Aula 19: Exceções: NullPointer e Arithmetic

import java.lang.Exception

fun main() {
    var str: String? = null
    // print(str!!.length)
    str = "Texto"
    try {
        println(str[str.length-1])
        val n = 10 / 0
        print(str!!.length)
    } catch (e: NullPointerException){
        println("A variável é nula!")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!")
    } finally {
        println("Fechando conexão com BD")
    }
    println("fim")

    try {
        return
    } catch (e: Exception){
        println("Exception")
    } finally {
        println("Finally")
    }
}