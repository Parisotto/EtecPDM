// Aula 48: forEach
fun main() {
    val data = geraDados()

    data.forEach { println(it.nome + ": " + it.calorias + " calorias") }
    data.filter { it.calorias > 500 }.forEach { println(it.nome) }
}