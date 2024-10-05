import javax.swing.text.Caret

// Aula 11: Controle de fluxo Condicional: "when()"

fun main() {
    val bonus = bonusWhen("Estagiário")
    println("Bonus de R$ $bonus")
    println("Bonus para Engenheiro de Software: ${bonusWhen("Engenheiro de Software")}")
    println("Bonus para Gerente: ${bonusIf("Gerente")}")

    val n = 0
    if (n in 1..10) {
        println("$n está entre 1 e 10")
    }
    when (n) {
        in 1..10 -> println("$n está entre 1 e 10")
    }

    val x = true
    when (x) {
        true -> println("É verdade este bilhete!")
        false -> println("Este bilhete é falso")
    }
}

fun bonusWhen(cargo: String): Double {
    var bonus: Double

    when(cargo){
        "Gerente" -> bonus = 2021.15
        "Coordenador" -> bonus = 1057.29
        "Engenheiro de Software" -> bonus = 1201.12
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
        bonus = 1057.29
    } else if (cargo == "Engenheiro de Software") {
        bonus = 1201.12
    } else if (cargo == "Estagiário") {
        bonus = 500.04
    } else {
        bonus = 0.00
    }
    return bonus
}