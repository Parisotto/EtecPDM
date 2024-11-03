// Aula 43: Array (matriz)
fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars.joinToString())
    println(cars[0])
    cars[3] = "AUDI"
    println(cars.size)
    println("Volvo" in cars)

    for (x in cars) {
        println(x)
    }

    val veiculos = arrayOf("Avião", "Barco", "Moto", "Bicicleta")

    val tudo = cars + veiculos

    for (x in tudo) {
        println(x)
    }
}