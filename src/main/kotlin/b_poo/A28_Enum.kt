package b_poo

// Aula 28: Enum (enumerador)
enum class AnimalEnum {
    Chachorro,
    Gato,
    Pássaro,
    Vaca,
    Cavalo,
    Tartaruga
}

enum class Prioridade() {
    Baixa, Media, Alta, Máxima
}

enum class Nivel(val valor: Int) {
    Básico(1) {
        override fun toString(): String {
            //return super.toString()
            return "Nível inicial: $valor"
        }
    },
    Intermediário(5),
    Avançado(15)
}

class TipoPrioridade(prioridade: String) {
    var pri = prioridade
    fun imprimir(): String {
        return pri
    }
}

class TipoPrioridade2(prioridade: Prioridade) {
    var pri = prioridade
    fun imprimir(): Prioridade {
        return pri
    }
}

class Veterinaria(animal: String) {
    var paciente: String = animal
    fun imprimir(): String {
        return "Paciente da Veterinaria: $paciente"
    }
}

class Veterinaria2(animal: AnimalEnum) {
    var paciente: AnimalEnum = animal
    fun imprimir(): String {
        return "Paciente da Veterinaria: $paciente"
    }
}

fun main() {
    val pri: TipoPrioridade = TipoPrioridade("Qualquer coisa")
    println(pri.imprimir())

    val pri2: TipoPrioridade2 = TipoPrioridade2(Prioridade.Alta)
    println(pri2.imprimir())


    val a: Veterinaria = Veterinaria("Peru")
    if (a.paciente != "Cachorro" || a.paciente != "Gato" || a.paciente != "Vaca") {
        println("A veterinária não atende ${a.paciente}s")
    }

    val paciente: Veterinaria2 = Veterinaria2(AnimalEnum.Tartaruga)
    println("O paciente é ${paciente.paciente}")

    for (valor in Nivel.values()) {
        print(valor.valor)
        print(" - ")
        println(valor)
    }

    println("\nEste é o nível: ${Nivel.Básico}")
    println("Este é o nível: ${Nivel.Avançado}")

    println("\nEste é o nível: ${Nivel.Básico.valor}")
    println("Este é o nível: ${Nivel.Avançado.valor}")
}