fun main() {
    val str = "Programação Kotlin."

    var msg = "Tamanho da string: ${str.length}" // propriedade length (comprimento, tamanho)
    msg = "Posição (index) 0 da string: ${str[0]}" // propriedade conteúdo no índice 0

    msg = str.startsWith("Pro").toString() // método booleano de string: começa com?
    msg = str.endsWith("abc").toString() // método booleano de string: termina com?

    msg = str.substring(2,4) // método de string que recupera do índice 2 até antes do 4
    msg = str.replace("Kotlin.", "com Kotlin!") // método de string que substitue um trecho de texto
    msg = str.lowercase() // converte tudo em minúsculas
    msg = str.uppercase() // converte tudo em maiúsculas

    val str2 = "     Usada no Android Studio!    "
    msg = str + str2 + str
    msg = str + str2.trim() + str
    msg = "$str ${str2.trim()} $str"

    println(msg)
}