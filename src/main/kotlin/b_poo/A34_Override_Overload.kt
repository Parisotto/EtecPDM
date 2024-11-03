// Aula 34: Override (substituir/sobrescrita) e Overload (sobrecarga)

open class Eletronico(var marca: String) {
    private fun corrente(ativo: Boolean){
        print("$marca ")
        println(if (ativo) { "ligado." } else { "desligado." })
    }
    fun ligar(){
        corrente(true)
    }
    //fun desligar(){
    //protected fun desligar(){
    open fun desligar(){ // função open pode ser sobrescrita na classe filha
        corrente(false)
    }
}

class Computador(marca: String) : Eletronico(marca) {
    fun save(){
        println("Arquivos salvos.")
    }
    // overload
    fun save(parametro: Int){}
    fun save(parametro: Double){}
    fun save(parametro: Boolean){}
    fun save(parametro: String){}
    fun save(parametro: String, parametro2: String){}
    fun save(parametro: String, parametro2: Int){}
    fun save(parametro: Int, parametro2: String){}
    fun save(parametro: Int, parametro2: Int){}


    override fun desligar(){ // sobrescrita
        save(1, 2)
        super.desligar()
    }
}

fun main() {
    val comp: Computador = Computador("Apple")

    comp.ligar()
    //comp.desligarComputador()
    comp.desligar()

    val eletro: Eletronico = Eletronico("Acer")
    eletro.desligar()
    println(eletro.marca)
}
