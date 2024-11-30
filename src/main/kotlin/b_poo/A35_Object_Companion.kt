// Aula 36: Object e Companion Object
class Matematica {
    companion object { // Pode ou nao ser nomeado: companion object NomeQualquer {
        val PI = 3.14
        fun teste(){ println("Apenas um Show") }
        init {
            println("Companion Object inicializado")
        }
    }
    object qualquer {
        val ANO = 1962
        val PI = 3.1415
        fun teste(){}
        init {
            println("Object inicializado")
        }
    }
    object outro {
        val PAIS = "BR"
        val PI = 3.141592
        fun teste(){}
    }
}

fun main() {
    Matematica.PI
    Matematica.PI
    Matematica.PI
    Matematica.teste()
    Matematica.qualquer.ANO
    Matematica.qualquer.ANO
    Matematica.qualquer.ANO
    println("----------")

    println(Math.PI)
    println(Matematica.PI)

    val umObjeto = Matematica
    println(umObjeto.PI)
    Matematica.teste()

    println(Matematica.qualquer.ANO)
}
