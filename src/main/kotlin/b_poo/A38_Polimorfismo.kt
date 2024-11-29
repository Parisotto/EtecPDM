// Aula 38: Polimorfismo
fun main() {
    // Herança
    // Encapsulamento
    // Abstração
    // Polimorfismo
    mostrarBonus(TechLead(15600.00))
    mostrarBonus(Developer(11500.00))
}
/*
fun mostrarBonus(funcionario: TechLead) {
    println(funcionario.bonus())
}

fun mostrarBonus(funcionario: Developer) {
    println(funcionario.bonus())
}
*/
fun mostrarBonus(funcionario: Funcionario) {
    println(funcionario.bonus())
}

interface Funcionario {  // ou abstract class Funcionario
    var salario: Double
    fun bonus(): Double
}

class TechLead(override var salario: Double) : Funcionario {
    override fun bonus(): Double {
        return salario * 0.5
    }

}

class Developer(override var salario: Double) : Funcionario {
    override fun bonus(): Double {
        return salario * 0.3
    }
}