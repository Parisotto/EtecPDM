// Aula 45: sum e sumOf
fun main() {
    val pares: List<Int> = listOf(2,4,6,8,10)
    println(pares.sum())  // 30

    val data = geraDados()
    println(data.sumOf { it.calorias })  // 4900
}
