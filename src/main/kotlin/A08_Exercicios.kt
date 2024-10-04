/*
    Aula 8: Exercício de reforço
    Métodos e funções
 */

fun main() {
    // transformar(2)
    // println(caracteres("Kotlin"))
    // cubo(3)
    // converter(2)
    trocarLetras("Anaconda") // xnxcondx
}
/* 1. Escreva uma função que seja capaz de receber a quantidade de anos e tranformar em meses, dias, horas, minutos e segundos. Saída desejada:
    2 anos equivalem a:
        24 meses
        730 dias
        17520 horas
        1051200 minutos
        63072000 segundos
 */
fun transformar(anos: Int){
    println("$anos equivalem a : ${anos * 12} meses")
    println("$anos equivalem a : ${anos * 365} dias")
    println("$anos equivalem a : ${anos * 365 * 24} horas")
    println("$anos equivalem a : ${anos * 365 * 24 * 60} minutos")
    println("$anos equivalem a : ${anos * 365 * 24 * 60 * 60} segundos")
}

// 2. Escreva uma função capaz de receber um string e retornar a quantidade de carcteres
fun caracteres(texto: String): String {
    return "$texto tem ${texto.length} caracteres."
}

// 3. Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n)
fun cubo(numero: Int) {
    print("O cubo de $numero é ${numero * numero * numero}")
}

// 4. Escreva uma função capaz de receber uma medida em milhas e converter em km (1 milha = 1.6 km)
fun converter(milhas: Int){
    println("$milhas milhas equivalem a ${milhas * 1.6} km")
}

/* 5. Escreva um programa que seja capaz de receber uma string e fazer a troca todas as letras "a" ou "A" por "x". Observando que:
    a. Não deve existir lógica dentro da função main. Main só deve ser usada como ponto de entrada.
    b. Escrever uma função para a troca de letras e impressão do valor final.
    c. String final deve estar com todas as letras maiúsculas
    Exemplo: Entrada = "Programação em Kotlin" - Saída = "PROGRxMxÇxO EM KOTLIN"
 */
fun trocarLetras(texto: String){
    // println(texto.lowercase().replace("a", "x"))
    // println(texto.replace("A", "x").replace("a", "x").lowercase())
    // println(texto.replace("a", "x", ignoreCase = true).lowercase())

    var textoFinal = texto.lowercase()
    textoFinal = textoFinal.replace("a", "x", true)
    println(textoFinal)
}

// 6. Sobre as funções criadas nos exercícios 2, 3 e 4, é possível transfomá-las em fuções de uma única linha? Se sim, trasforme-as.
fun caracteres2(texto: String): String {
    return "$texto tem ${texto.length} caracteres."
}
fun caracteres3(texto: String) = "$texto tem ${texto.length} caracteres."

fun cubo2(numero: Int) {
    print("O cubo de $numero é ${numero * numero * numero}")
}
fun cubo3(numero: Int) = print("O cubo de $numero é ${numero * numero * numero}")

fun converter2(milhas: Int){
    println("$milhas milhas equivalem a ${milhas * 1.6} km")
}
fun converter3(milhas: Int) = println("$milhas milhas equivalem a ${milhas * 1.6} km")
