package a_introducao

import java.lang.Exception

// Aula 19: Exceções: NullPointer e Arithmetic

fun main() {
    var str: String? = null // ? aceita valor nulo

    println(str?.length) //  ? assume nulo, tamanho nulo
    //println(str!!.length) // !! aceite que pode haver excessão

    try {
        //val n = 10/0
        println(str!!.length) // lança uma exceção: NullPointerException
        println("Nâo vai ser impressa!")
    } catch (e: NullPointerException) {
        println("A variável é nula!")
    } catch (e: ArithmeticException) {
        println("Ipossível dividir por zero!")
    } catch (e: Exception) {
        println("Aconteceu um erro Genérico")
    } finally {
        println("Fechando conexão com BD")
    }

    println("Fim.")

    try {
        return
    } catch (e: Exception){
        println("Exception")
    } finally {
        println("Finally")
    }
}