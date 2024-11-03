// Aula 46: Filter
fun main() {
    val data = geraDados()

    println(data.filter { it.nome == "Lasanha" })
    val receita = data.filter { it.calorias >= 500 }
    println(receita.size)

    println(data.any { it.calorias >= 500 })
    println(data.any { it.calorias >= 5000 })

    println(data.count { it.calorias >= 500 })
}

