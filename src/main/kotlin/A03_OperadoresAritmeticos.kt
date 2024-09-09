// Aula 3: Operadores Aritméticos: ( + - * / % )

fun main() {
    var idade = 20
    //idade = idade + 1
    idade += 1 // soma (+)
    //idade = idade - 5
    idade -= 5 // subtração (-)
    //idade = idade * 2
    idade *= 2 // multiplicação (*)
    //idade = idade / 2
    idade /= 2 // divisão (/)
    //idade = idade % 3
    idade %= 3 // resto da divisão (%)

    println("Quantos anos tem este edifício? Acho que $idade.")

    var valor = 10 / 3f // divisão com decimal
    println("O valor é $valor")

    // Operadores unários de incremento (++) e decremento (--)
    println()
    var contador = 9
    contador++
    println("1) $contador")
    println("2) ${contador++}")
    println("3) $contador")

    contador--
    println("4) $contador")
    println("5) ${--contador}")
    println("6) ${++contador}")
}

