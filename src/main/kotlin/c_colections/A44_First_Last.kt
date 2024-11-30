// Aula 44: funções First e Last
fun main() {
    val data = geraDados()
    var bananas: List<Any> = listOf()
    bananas = listOf("nanica")

    println("Primeira reeita: ${ data.first().nome }") // Lasanha
    println("Última Receita: ${ data.last().nome } ")  // Hamburguer

    // bananas.first() -> lança exceção porque a lista está vazia: List is empty
    println(bananas.firstOrNull())  // nanica
    println(bananas.lastOrNull())  // nanica

    println("O primeiro elemento é: ${if (bananas.firstOrNull() == "null") "nenhum" else bananas.firstOrNull()}")  // nanica
    println("O último elemento é: ${if (bananas.lastOrNull() == "null") "nenhum" else bananas.lastOrNull()}")  // nanica
}



