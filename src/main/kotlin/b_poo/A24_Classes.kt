package b_poo

//Aula 24: Classes
class Pessoa

class Livro(var titulo: String, var autor: String, var ano: Int, var paginas: Int) {
    var marcador = 0

    fun abirPagina(p: Int){
        println("\nb_poo.Livro $titulo aberto na página $p")
    }

    fun marcarPagina(p: Int) {
        this.marcador = p
        print("Marcada a página $marcador")
    }

}

fun main() {
    var pessoa: Pessoa = Pessoa()
    var gente: Pessoa = Pessoa()
    var carinha: Pessoa = Pessoa()

    gente

    var meuLivro: Livro = Livro("Duna", "Frank Herbert", 1965, 680)
    print(meuLivro.titulo)
    print(" ")
    print(meuLivro.autor)
    print(" ")
    print(meuLivro.ano)
    print(" ")
    print(meuLivro.paginas)

    println()
    var proximoLivro: Livro = Livro("Fundação", "Isaac Asimov", 1951, 260)
    proximoLivro.marcarPagina(9)
    proximoLivro.abirPagina(proximoLivro.marcador)

}