// Aula 41: Estrutura de dados -> Coleções: List, Set, Map e Array
// Set (conjunto) e MutableSet
fun main() {
    // Conjunto -> setOf(): é um colection / coleção da classe Set
    // Set é IMUTÁVEL, sempre do tipo val
    // Set é um conjunto NÃO ordenado e NÃO aceita valores duplicados

    val conjuntoGenerico = setOf("Brasil", 1, true, 1, 'c', 7.9, "Brasil")
    println(conjuntoGenerico)
    println(conjuntoGenerico.contains("Brasil"))
    println(conjuntoGenerico.size)
    println()

    val conjuntoVazio1: Set<Int> = setOf()
    val conjuntoVazio2 = setOf<Double>()

    val conjuntoMutavel: MutableSet<String> = mutableSetOf("Brasil", "Argentina", "Uruguai")
    conjuntoMutavel.add("Chile")
    println(conjuntoMutavel)
    conjuntoMutavel.remove("Uruguai")
    println(conjuntoMutavel)
    println(conjuntoMutavel.contains("Brasil"))
    //conjuntoMutavel[0]
    //conjuntoMutavel.removeAt
    conjuntoMutavel.clear()
    println(conjuntoMutavel)
    println(conjuntoMutavel.size)
}

fun abc(conjuntoQualquer: Set<Int>) {}