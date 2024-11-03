// Aula 36: Object e Companion Object
class Matematica {
    companion object { //
        val PI = 3.14
        fun teste(){}
        init {
            println("Companion Object inicializado")
        }
    }
    object qualquer {
        val ANO = 1962
        fun teste(){}
        init {
            println("Object inicializado")
        }
    }
    object outro {
        val PAIS = "BR"
        fun teste(){}
    }}

fun main() {
    Matematica.PI
    Matematica.PI
    Matematica.PI
    Matematica.qualquer.ANO
    Matematica.qualquer.ANO
    Matematica.qualquer.ANO
    println("----------")

    println(Math.PI)
    println(Matematica.PI)

    val pi = Matematica
    println(pi.PI)
    Matematica.teste()

    println(Matematica.qualquer.ANO)
}
