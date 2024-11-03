// Aula 50: Função map, average, distinct, sorted e reversed
fun main() {
    val data = geraDados()

    println(data.filter { it.calorias > 500 })
    println(data.map { it.nome })
    println(data.map { it.calorias })
    println(data.map { it.calorias }.sum())

    println(data.map { it.calorias }.average())

    println(listOf(5,6,7,3,4,1,2,3,4,5,1).distinct())

    var paises = listOf("Brasil", "Portugal", "Brasil", "Itália", "Brasil", "Uruguai")
    println(paises.distinct())
    println(paises.sorted())
    println(paises.sortedDescending())
    println(paises.reversed())
}