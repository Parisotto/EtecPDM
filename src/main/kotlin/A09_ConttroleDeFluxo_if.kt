// Aula 9: Controle de Fluxo Condicioanal: "if"

fun main() {
    maioridade(23)
    maioridade(15)

    habilitacao(21)
    habilitacao(13)

    idoso(61)
    idoso(45)

    ingresso(63)
    ingresso(11)
    ingresso(28)
}

// 1
fun maioridade(idade: Int){
    if (idade > 17){
        println("1) É maior de idade")
    }
    println("    Fim da função 1")
}

// 2
fun habilitacao(idade: Int){
    if (idade > 17){
        println("2) Você pode obter uma habilitação.")
    }

    if (idade < 18){
        println("2) Você não pode obter uma habilitação.")
    }
}

// 3
fun idoso(idade: Int){
    if (idade > 59){
        println("3) É um idoso")
    } else {
        println("3) Não é um idoso")
    }
}

// 4
fun ingresso(idade: Int){
    if (idade > 59){
        println("4) É um idoso e não paga ingresso.")
    } else if (idade < 13) {
        println("4) Tem menos de 13 anos e paga meia.")
    } else {
        println("4) Paga inteira.")
    }
    println("4a) Bem-vindo ao Parque Feliz")
}
