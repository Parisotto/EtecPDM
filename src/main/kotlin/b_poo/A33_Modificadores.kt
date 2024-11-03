package b_poo // Aula 33: Modificadores de Visibilidade -> private, public e protect

private class Inutil // visivel somente no arquivo

open class Eletronic(private var marca: String){
    private var sistema: String = ""
    // private fun ativarCorrente(){ // private abstraiu a classe / só a classe enxerga

    protected fun ativarCorrente(){ // menos restritivo. A classe e aos herdeiros somente
        sistema = "Android"
        println("$marca ligado")
    }
    fun ligar(){
        ativarCorrente() // tenho acesso sendo private ou protect
        Inutil()
    }
    fun desligar(){}

}

// public class é redundante
class Computer(marca: String) : Eletronic(marca) { // "public marca" é redundante
    fun processar(){
        //ativarCorrente() -> é private
        ligar()
        //println($marca) -> se acesso porque não foi declara "var marca"
        ativarCorrente() // tenho acesso porque é private na class Eletronic
    }
    fun armazenarDados(){
        Inutil()
    }
}

fun main() {
    var c: Computer = Computer("DELL")

    c.ligar()
    c.desligar()
    // c.marca -> é private
    // c.ativarCorrente() -> é private ou protect
    Inutil()

}
