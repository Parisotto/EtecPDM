// Aula 25: Construtores primário e secundario
class Vazia()
class Qualquer private constructor()
class Persona(var nome: String, var anoNasc: Int) {
    var altura: Double = 0.0
    var doc: String? = null

    constructor(nome: String, anoNasc: Int, doc: String) : this(nome, anoNasc) {
        this.doc = doc.uppercase()
        if (this.doc == "RG"){
            println("Documento aceito")
        } else {
            println("Documento recusado")
        }
    }

    fun acordar(){

    }
    fun dormir(){

    }
}

fun main() {
    Vazia()
    // Qualquer()
    // Nothing() // ctrl + b

    var professor: Persona = Persona("Parisotto", 1962)
    // this - se refere ao objeto instaciado pela classe

    professor.altura
    professor.acordar()

    var aluno: Persona = Persona("Sofia", 2011, "Rg")

    println("Professor: ${professor.doc}")
    println("Aluno: ${aluno.doc}")

    professor.altura = 1.77
    println(professor.altura)
}