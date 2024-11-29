package b_poo

// Aula 24: Classes
class Pessoa

class Livro(var titulo: String, var autor: String, var ano: Int, var paginas: Int = 300) {
    var marcador = 0

    fun abrirPagina(p: Int) {
        println("\nLivro $titulo aberto na página $p")
    }

    fun marcarPagina(p: Int) {
        this.marcador = p
        print("Marcada a página $marcador")
    }
}

fun main() {
    // class tem comportamentos e características (métodos e atributos)
    // classe -> objeto
    // classe instancia objetos

    var pessoa: Pessoa = Pessoa()
    var gente: Pessoa = Pessoa()
    var carinha: Pessoa = Pessoa()

    gente

    var meuLivro: Livro = Livro("Duna", "Frank Hebert", 1965, 680)
    var proximoLivro: Livro = Livro("Fundação", "Isaac Asimov", 1951
    )

    println(meuLivro.titulo)
    meuLivro.marcarPagina(9)
    meuLivro.abrirPagina(meuLivro.marcador)

    println()
    println(proximoLivro.titulo)
    proximoLivro.marcarPagina(27)
    proximoLivro.abrirPagina(proximoLivro.marcador)

    println()
    meuLivro.abrirPagina(meuLivro.marcador)

}