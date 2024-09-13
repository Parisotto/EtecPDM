/*
    Aula 8: Exercício de reforço
    Métodos e Funções
*/
fun main(){
    // tranformar(2)
     println(caracteres2("Kotlin"))
     cubo2(3)
     converter2(2)
    // trocarLetras("Anaconda!")
}

/* a. Escreva uma função que seja capaz de receber a quantidade de anos e
    transformar em meses, dias, horas, minutos e segundos. Saída desejada:
                2 anos equivalem a:
                    24 meses
                    730 dias
                    17520 horas
                    1051200 minutos
                    63072000 segundos */
fun tranformar(anos: Int){
    println("$anos equivalem a: ${anos * 12} meses")
    println("$anos equivalem a: ${anos * 365} dias")
    println("$anos equivalem a: ${anos * 365 * 24} horas")
    println("$anos equivalem a: ${anos * 365 * 24 * 60} minutos")
    println("$anos equivalem a: ${anos * 365 * 24 * 60 * 60} segundos")
}

// b. Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.
fun caracteres(texto: String):String {
    return "$texto tem ${texto.length} caracteres"
}

// c. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).
fun cubo(numero: Int){
    println("O cubo de $numero é ${numero * numero * numero}")
}
// d. Escreva uma função capaz de receber milhas e converter em km (1 milha = 1.6 km).
fun converter(milhas: Int){
    println("$milhas milhas equivalem a ${milhas * 1.6} km")
}

/* e. Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras "a" ou "A" por "x". Observando que:
        1. Nâo deve existir lógica dentro da função main. Main só deve ser usada como ponto de entrada.
        2. Escrever uma função para a troca de letras e impressão do valor final.
        3. String final deve estar com todas as letras minúsculas. */
fun trocarLetras(texto: String){
    println(texto.lowercase().replace("a", "x"))
}

// f. Sobre as funções criadas nos exercícios b, c e d: é possível transformá-las em funões de uma única linha? Se sim, transforme-as.
fun caracteres2(texto: String) = "$texto tem ${texto.length} caracteres"
fun cubo2(numero: Int) = println("O cubo de $numero é ${numero * numero * numero}")
fun converter2(milhas: Int) = println("$milhas milhas equivalem a ${milhas * 1.6} km")
