// Aula 49: Max e Min
fun main() {
    val data = geraDados()

    println(data.maxOf { it.calorias })  // 2000
    println(data.minOf { it.calorias })  // 200

    println(listOf(1,2,3,4,5,6,7).maxOf { it })   // 7
    println(listOf<Int>().maxOfOrNull { it })  // null

    println(data.maxBy { it.nome })
    println(data.maxByOrNull { it.calorias })
}