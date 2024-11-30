// Aula 39: Classe Anônima
fun main() {
    val p: Programa = Programa()
    val e = Processo()
    p.salvar(e)
    p.salvar(Processo())
    p.salvar(object : Evento {
        override fun sucesso() {
            println("Classe AnônimaSucesso!\n")
        }
    })
}

interface Evento {
    fun sucesso()
}

class Processo : Evento {
    override fun sucesso() {
        println("Classe Processo Sucesso!\n")
    }
}

class Programa {
    fun salvar(e: Evento) {
        print("Conexão: ")
        e.sucesso()
    }
}