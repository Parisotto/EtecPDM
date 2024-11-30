// Aula 42: Estrutura de dados -> Coleções: List, Set, Map e Array
// Map (mapa): "CHAVE"->"VALOR" e MutableMap
fun main() {
    // Map -> mapOf(): é um colection / coleção da classe Map
    // Map é IMUTÁVEL, sempre do tipo val
    // Map é um conjunto NÃO ordenado e NÃO aceita valores duplicados
    // Se houver dois valores com chaves iguais vale apenas a última

    val paises: Map<String, String> = mapOf(Pair("Brasil", "Brasilia"), Pair("Itália", "Roma"), Pair("Brasil","Brasília"))
    println(paises)

    println(paises.size)
    println(paises.entries)
    println(paises.values)
    println(paises["Itália"])
    println()

    val estados = mutableMapOf<String, String>(Pair("SP", "São Paulo"), Pair("RJ", "Rio"), "MG" to "Minas Gerais")
    println(estados)
    estados["RJ"] = "Rio de Janeiro"
    println(estados)

    estados.remove("RJ")
    println(estados)

    println(estados.contains("SP"))
    println(estados.containsKey("SP"))

    println(estados.contains("São Paulo"))
    println(estados.containsValue("São Paulo"))

    estados.clear()
    println(estados)
}