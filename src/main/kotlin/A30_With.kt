// Aula 30: with
fun main() {
    val meuLivro = Livro("Blade Runner", "Philip K Dick", 1980, 300)
    meuLivro.marcarPagina(27)
    meuLivro.abrirPagina(meuLivro.marcador)

    with(meuLivro) {
        marcarPagina(72)
        abrirPagina(marcador)
        println()
        println(this.autor)
        println(this.ano)
        println(paginas)
    }

    val livroCompradoParaDoacaoParaBibliotecaEtecJRM = Livro("Blade Runner", "Philip K Dick", 1980, 300)
    with(livroCompradoParaDoacaoParaBibliotecaEtecJRM){
        println()
        marcarPagina(101)
        abrirPagina(marcador)
    }
}
