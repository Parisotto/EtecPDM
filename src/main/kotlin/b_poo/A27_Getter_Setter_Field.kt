// Aula 27: Getter, Setter e Field

class Pet(var especie: String) {
    var fala: String = ""
        get() {
            println("Acesso ao get da fala")
            return field
        }
        set(valor){
            println("Acesso ao set da fala")
            field = valor
        }
}

class Personagem(var nome: String){
    var midia: String = ""
}

fun main() {
    var mingau = Pet("gato")
    mingau.fala = "Miau!"
    println(mingau.fala)

    val morcego: Personagem = Personagem("Batman")
    morcego.midia = "Comics"
    print(morcego.nome)
    println(morcego.midia)

}