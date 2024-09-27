// Aula 17: Controle de Fluxo: Laço de Repetição: continue e break

fun main() {
    while (true){
        break
    }

    var i = 0
    while (true){
        i++
        print("$i, ")
        if (i > 10) break
    }
    println()

    var volta = 1
    do {
        print("$volta, ")
        volta++
        if (volta == 16) break
    } while (volta < 9999999999)
    println()

    for (valor in 1..20){
        print("$valor, ")
        if (valor == 13) break
    }
    println()

    var y = 0
    while (y <= 20){
        y++
        if (y % 2 != 0){
            continue
        }
        print("$y, ")
    }
}