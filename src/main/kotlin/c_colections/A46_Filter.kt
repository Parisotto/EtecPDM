// Aula 46: Filter
fun main() {
    val data = geraDados()

    println(data.filter { it.nome == "Lasanha" }) // 4
    val receita = data.filter { it.calorias >= 500 }
    println(receita.size)

    println(data.any { it.calorias >= 500 }) // true
    println(data.any { it.calorias >= 5000 }) // false

    println(data.count { it.calorias >= 500 }) // 4
}

