// Aula 31: lateinit
fun main() {
    var r: Receita = Receita()
    println(r.instrucoes?.length)
    //println(r.instrucoes!!.length)
    //r.geraReceita()
    //println(r.novasInstrucoes)
}

class Receita {
    var instrucoes: String? = null
    //lateinit var novasInstrucoes: String


}