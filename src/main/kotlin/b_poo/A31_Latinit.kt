package b_poo

// Aula 31: lateinit
fun main() {
    var r: Receita = Receita()
    //println(r.instrucoes?.length)
    //println(r.instrucoes!!.length)
    //r.geraReceita()
    //println(r.novasInstrucoes)
    r.imprimeReceita()
}

class Receita {
    var instrucoes: String? = null
    lateinit var novasInstrucoes: String // Obriga ser var, pois val não pode ser reatribuida.
    // val novasInstrucoes: String = "" -> lateinit é melhor porque não ocupa espaço na memória antes de ser inicializada.

    fun geraReceita(){
        novasInstrucoes = "Lave as mãos."
    }

    fun imprimeReceita(){
        if(!this::novasInstrucoes.isInitialized) {
            novasInstrucoes = "Então, lave as mãos."
            println(novasInstrucoes)
        } else {
            println(novasInstrucoes)
        }
    }
}