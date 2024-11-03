// Aula 37: Interfaces
interface Selvagem {
    fun ataque()
    fun predar(){
        println("Caçador")
    }
    // não tem estado, variáveis sem valor, não quarda valor.
    // não pode ser instanciada
    // define um contrato
}

interface Ave {
    fun voar()
}

abstract class Animal{
    val atributo = 0
    abstract fun alimento()
}

abstract class Mamifero2(val nome: String) : Animal() {
    override fun alimento() {
        TODO("Not yet implemented")
    }
    fun acordar(){
        println("$nome acordou!")
    }
    fun dormir(){
        println("$nome dormiu!")
    }
    open fun falar(){
        println("$nome não emite som!")
    }
    abstract fun tipo()
}

class Cachorro2(nome: String = "cachorro") : Mamifero2(nome) { // não posso extender também Animal porque não existe herança multipla.
    override fun tipo() {
        println("doméstico")
    }
}

class Girafa2() : Mamifero2("girafa"), Selvagem, Ave {
    override fun voar() {
        TODO("Not yet implemented")
    }
    override fun ataque(){
        println("não ataca")
    }
    override fun tipo(){
        println("selvagem")
    }
}

fun main() {
    val animal = Girafa2()
    animal.ataque()
    animal.predar()
}