// Aula 26: init

class Animal(var especie: String){
    var fala: String = ""

    init {
        println("init 1")
    }

    init {
        if (especie == "cachorro") {
            fala = "latir"
        } else if ( especie == "gato") {
            fala = "miar"
        } else if ( especie == "passaro") {
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
    //Animal("cachooro")
    var snoopy = Animal("cachorro")
    snoopy.falar()
    //snoopy.fala = "latir"
    //snoopy.falar()

    var mingau = Animal("gato")
    mingau.falar()
    //mingau.fala = "miar"
}