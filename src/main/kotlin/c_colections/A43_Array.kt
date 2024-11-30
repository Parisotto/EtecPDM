// Aula 43: Array (matriz)
fun main() {
    // Arrays são estruturas de dados que contêm um número fixo de elementos do mesmo tipo.
    // Imutabilidade: O tamanho do array é fixo e não pode ser alterado após a criação.
    // Mutabilidade dos Elementos: Os elementos de um array podem ser modificados.
    // use arryOf() ou Array()
    // Uso: Ideal para quando você sabe o número exato de elementos que deseja armazenar e que não vai mudar.

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars.joinToString())
    println(cars[0])
    cars[3] = "AUDI"  // Mutável: pode modificar os elementos
    println(cars.size)
    println("Volvo" in cars)

    cars.size

    for (x in cars) {
        println(x)
    }

    val veiculos: Array<String> = arrayOf("Avião", "Barco", "Moto", "Bicicleta")

    val tudo = cars + veiculos

    for (x in tudo) {
        println(x)
    }

    var vetor: Array<String> = arrayOf("Brasil", "Argentina", "Uruguai", "Brasil")
    var lista: MutableList<String> = mutableListOf("Brasil", "Argentina", "Uruguai", "Brasil")
    var conjunto: MutableSet<String> = mutableSetOf("Brasil", "Argentina", "Uruguai", "Brasil")
    var mapeado: MutableMap<String, String> = mutableMapOf(Pair("BR","Brasil"), Pair("AR","Argentina"), Pair("UR","Uruguai"), Pair("BR","Brasil"))

    lista.add("Chile")
    conjunto.add("Chile")
    mapeado["CH"] = "Chile"

    println(vetor.joinToString())
    println(lista)
    println(conjunto)
    println(mapeado)

}