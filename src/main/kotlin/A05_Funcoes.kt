fun main(){
    println("Início")

    bomDia()
    bomDia()
    bomDia()

    ola("Edson")
    println(soma(3, 9))
    println(subtracao(10.0))

    println(divisao(10,3.0))

    val resultado = soma(10, 8)
    println(resultado)
    println(subtracao(10.0, resultado))
    println(resultado * soma(2, 5))
    println(soma(3, resultado) * subtracao(2.0, resultado))

    mensagem("Edson", 61)
    mensagem(61, "Edson")
}

fun bomDia(){
    println("Bom dia!")
}
fun bonDia2() = println("Bom dia!")

fun ola(nome:String){
    println("Olá, $nome")
}
fun ola2(nome: String) = println("Olá, $nome")

fun soma(a: Int, b: Int):Int {
    return a + b
}
fun soma2(a: Int, b: Int) = a + b

fun subtracao(a:Double, b: Int = 3):Double{
    return a - b
}
fun subtracao2(a: Double, b: Int = 3) = a - b

fun divisao(a:Int, b:Double) = (a / b)

fun mensagem(nome: String){
    println("Olá, $nome")
}
fun mensagem(nome: String, sobrenome: String){
    println("Bem-vindo $nome $sobrenome!")
}
fun mensagem(nome: String, idade: Int){
    println("Coma vai, $nome. Você tem $idade anos?")
}
fun mensagem(idade: Int, nome: String){
    println("Você tem $idade, $nome?")
}