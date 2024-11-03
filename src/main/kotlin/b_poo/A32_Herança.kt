package b_poo // Aula 32: OO Herança

open class Eletronico(val marca: String){
    // para ser herdada precisa ser "open" e ter "var/val"
    fun ligar(){}
    fun desligar(){
        //Inutil()
    }
}

class Computador(marca: String) : Eletronico(marca) {
    fun processar(){}
    fun armazenarDados(){
        //Inutil()
    }
}



fun main() {
    var c: Computador = Computador("DELL")
    var c2: Computador = Computador("Acer")

    c.ligar()
    c.desligar()
    c.marca
    //Inutil() -> é private aula A33
}
