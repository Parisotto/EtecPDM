// Aula 26: init
class Animal(var especie: String) {
    var fala: String = ""

    init {
        println("init 1")
    }

    init {
        println("init 2")
    }

    init {
        if (especie == "cachorro"){
            fala = "latir"
        } else if (especie == "gato") {
            fala = "miar"
        } else if (especie == "passaro") {
            fala = "piar"
        } else {
            fala = ""
        }
    }

    fun falar(){
        println(fala)
    }
}

fun main() {
    // Animal("cachorro")
    var bicho: Animal = Animal("passaro")
    bicho.falar()
    bicho.fala = "Cantar"
    bicho.falar()

    Animal("gato").falar()
}
