// Aula 36: Classes Abstratas
abstract class Mamifero(val nome: String) { // classe abstrata tem que ser herdada, é apenas um molde
    fun acordar(){
        println("$nome acordou!")
    }
    fun dormir(){
        println("$nome dormiu!")
    }
    open fun falar(){
        println("$nome não emite som!")
    }
    abstract fun tipo() // obriga classe filha implementar, não pode ter corpo, obriga a classe a ser também abstrata
}

class Cachorro(nome: String = "cachorro") : Mamifero(nome){
    override fun falar(){
        println("$nome late")
    }
    override fun tipo(){
        println("doméstico")
    }
}

class Girafa() : Mamifero("girafa"){
    override fun tipo(){
        println("selvagem")
    }
}

fun main() {
    val pet1 = Cachorro("Snoopy")
    pet1.falar()

    val bicho = Girafa()
    bicho.falar()

    // val animal: Mamifero = Mamifero("qualquer") -> classe abstra não pode ser instanciada
}