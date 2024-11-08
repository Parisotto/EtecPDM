// Aula 25: Construtores primário e secundário
class Vazia
class Qualquer private constructor()

class Persona(var nome: String, var anoNasc: Int){
    var altura: Double = 0.0
    var doc: String? = null

    constructor(nome: String, anoNasc: Int, doc: String) : this(nome, anoNasc) {
        this.doc = doc.uppercase()
        if (this.doc == "RG") {
            println("Documento aceito")
        } else {
            println("Documenteo recusado")
        }
    }
    fun acordar(){}
    fun dormir(){}
}

fun main() {
    Vazia()
    // Qualquer()
    // var qualquer: Qualquer = Qualquer()
    // Nothing()

    var professor: Persona = Persona("Parisotto", 1962)
    professor.altura = 1.77
    println(professor.altura)
    professor.dormir()


    var aluno: Persona = Persona("Sofia", 2011, "rG")
    println("Aluno: ${aluno.doc}")
    aluno.acordar()

    println("Professor: ${professor.doc}")
    professor.doc = "CPF"
    println("Professor: ${professor.doc}")

}