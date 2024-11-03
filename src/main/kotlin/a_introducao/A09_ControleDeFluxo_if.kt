package a_introducao

// Aula 9: Controle de Fluxo Condicional "if"

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
        println("2) Você pode obter uma habilitação")
    }

    if(idade < 18) {
        println("2) Você não pode obter uma habilitação")
    }
}

// 3
fun idoso(idade: Int){
    if (idade > 59){
        println("3) Você é idoso.")
    } else {
        println("3) Você não é um idoso.")
    }
}

// 4
fun ingresso(idade: Int){
    if (idade > 59){
        println("4) Você é idoso e não paga ingresso")
    } else if (idade < 13) {
        println("4) Você tem menos de 13 anos e paga meia entrada.")
    } else {
        println("4) Você tam ingresso inteiro")
    }
    println("4a) Bem-vindo ao Parquinho Feliz")
}

// 5
fun festaDoChopp(idade: Int){
    if (idade > 17){
        println("5) Pode entrar na fila")
        if (idade > 60){
            println("5) Prioridade na fila")
        }
    } else {
        println("5) Não pode entrar")
    }
}

// 6
fun funcionario(sim: Boolean): String{
    return if (sim){
        "6) Entrada liberada"
    } else {
        "6) Entrada proibida"
    }
}

// 6
fun funcionario2(sim: Boolean) = if (sim){
        "6) Entrada liberada"
    } else {
        "6) Entrada proibida"
    }


fun main() {
    maioridade(23)
    maioridade(15)

    habilitacao(18)
    habilitacao(17)

    idoso(61)
    idoso(59)

    ingresso(62)
    ingresso(11)
    ingresso(25)

    festaDoChopp(20)
    festaDoChopp(65)
    festaDoChopp(16)

    var resposta = funcionario(true)
    println(resposta)
    println(funcionario(false))
}
