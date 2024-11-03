// Aula 44: funções First e Last
fun main() {
    val data = geraDados()
    var bananas: List<Any> = listOf()
    bananas = listOf("nanica")

    println("Primeira reeita: ${ data.first().nome }")
    println("Última Receita: ${ data.last().nome } ")

    // bananas.first() -> lança exceção porque a lista está vazia: List is empty
    println(bananas.firstOrNull())
    println(bananas.lastOrNull())

    println("O primeiro elemento é: ${if (bananas.firstOrNull() == "null") "nenhum" else bananas.firstOrNull()}")
    println("O último elemento é: ${if (bananas.lastOrNull() == "null") "nenhum" else bananas.lastOrNull()}")
}



