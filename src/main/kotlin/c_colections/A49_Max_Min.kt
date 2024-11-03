// Aula 49: Max e Min
fun main() {
    val data = geraDados()

    println(data.maxOf { it.calorias })
    println(data.minOf { it.calorias })

    println(listOf(1,2,3,4,5,6,7).maxOf { it })
    println(listOf<Int>().maxOfOrNull { it })

    println(data.maxBy { it.nome })
}