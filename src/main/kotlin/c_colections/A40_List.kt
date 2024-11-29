/* Aula 40: Estrutura de dados -> Coleções: List, Set, Map e Array
   List (lista) e MutableList (lista mutável)

Estruturas de dados são maneiras de organizar e armazenar dados
para que possam ser acessados e manipulados de forma eficiente.
Em Kotlin, você tem várias opções, cada uma com suas próprias
características e usos. Os principais exemplos são:
   * List -> lista: Armazena uma sequência ordenada de elementos.
   * Set -> conjunto: Armazena elementos únicos, sem duplicatas.
   * Map -> mapa: Armazena pares chave-valor, onde cada chave é única.
   * Array -> : Uma coleção de elementos do mesmo tipo, com tamanho fixo.
Essas estruturas são a base para a construção de algoritmos e são
fundamentais para a programação eficiente e eficaz. */
fun main() {
    // String é um conjunto de caracteres, mas não é uma coleção.
    val str: String = "Kotlin"

    // Lista -> listOf(): é um colection / coleção da classe List
    // List é IMUTÁVEL, sempre do tipo val
    // List é um conjunto ordenado e aceita valores duplicados
    // Lista Mutável -> mutableListOf()  // a versão mutável da list

    val listaNumeros = listOf(1, 2, "tres", 4.7, 5, 6, true, 2)
    val listaNumerosInt: List<Int> = listOf(7, 9, 13, 0, 9)
    val listaHeterogea: List<Any> = listOf("Texto", 1, true, 1)

    val listaPaises: List<String> = listOf("Brasil", "China", "EUA", "UK", "Brasil")
    println(listaPaises)
    println(listaPaises[0])
    println(listaPaises.size)
    // listaPaises.add("Argentina")

    // MutableList é uma List que aceita mudanças
    // Uso: Ideal para quando você precisa adicionar, remover ou modificar elementos dinamicamente.
    val listaMutavel: MutableList<String> = mutableListOf("janeiro", "fevereiro", "março")
    println(listaMutavel)
    println(listaMutavel[0])

    listaMutavel.add("abril")
    println(listaMutavel)
    println(listaMutavel.size)

    listaMutavel.remove("fevereiro")
    println(listaMutavel)

    listaMutavel.removeAt(1)
    println(listaMutavel)
}
