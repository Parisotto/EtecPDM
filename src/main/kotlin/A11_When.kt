// Aula 11: Controle de fluxo "when"

fun main() {
    val bonus = bonusWhen("")
    println("Bonus de R$ $bonus")

    val n = 0
    if (n in 1..10) {
        println("$n está entre 1 e 100")
    }
    when (n) {
        in 101..1000 -> println("$n está entre 11 e 1000")
        in 1..100 -> println("$n está entre 1 e 100")
    }
    val x = true
    when (x) {
        true -> println("É verdade este bilhete!")
        false -> println("Este bilhete é falso!")
    }
    if (x) {
        println("É verdade este bilhete!")
    } else {
        println("Este bilhete é falso!")
    }
}

fun bonusWhen(cargo: String): Double {
    var bonus: Double

    when(cargo) {
        "Gerente" -> bonus = 2021.15
        "Coordenador" -> bonus = 1507.29
        "Engenheiro de software" -> bonus = 1201.12
        "Estagiário" -> bonus = 500.04
        else -> bonus = 0.00
    }
    return bonus
}

fun bonusIf (cargo: String): Double {
    var bonus: Double

    if (cargo == "Gerente") {
        bonus = 2021.15
    } else if (cargo == "Coordenador") {
        bonus = 1507.29
    } else if (cargo == "Engenheiro de software") {
        bonus = 1201.12
    } else if (cargo == "Estagiário") {
        bonus = 500.04
    } else {
        bonus = 0.00
    }
    return bonus
}