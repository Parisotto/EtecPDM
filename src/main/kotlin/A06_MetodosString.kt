// Aula 6: Métodos e propriedades de String

fun main(){
    val str = "Programação Kotlin"
    var msg:String

    msg = "Tamanho da string: ${str.length} caracteres"
    // propriedade length (comprimento, tamanho)

    msg = "Posição (indíce) 0 da string: ${str[9]}"
    // propriedade conteúdo no índice 0

    msg = str.startsWith("Pro").toString()
    // método booleano de string: comça com?

    msg = str.endsWith("abc").toString()
    // método booleano de string: termina com?

    msg = str.substring(2,9)
    // método de string que recupera do índice 2 até antes do 9

    msg = str.replace("Kotlin", "com Kotlin.")
    // método de string que substitue um trecho de texto

    msg = str.lowercase()
    // converte tudo em minúculas

    msg = str.uppercase()
    // converte tudo em maiúsculas

    val str2 = "         Usada no Android Studio!      "
    msg = str2.trim()
    msg = str + str2.trim() + str
    msg = "$str ${str2.trim()} $str"

    println(msg)
}