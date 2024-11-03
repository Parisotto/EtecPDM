package b_poo

// Aula 29: Data Class
fun main() {
    val f1: FormaGeo = FormaGeo(10, 8)
    val f2: FormaGeo = FormaGeo(10, 8)
    val f3: FormaGeo = f1

    val f4 = FormaGeo2(10, 0)
    val f5 = FormaGeo2(10, 0)

    val f6 = FormaGeoData(10, 8)
    val f7 = FormaGeoData(10, 8)
    val f8 = f7
    val f9 = f7.copy(50)

    println(f1.toString())
    println(f1.hashCode())

    println("===================")
    println(f2.toString())
    println(f2.hashCode())

    println("===================")
    println(f1.equals(f2))

    println("===================")
    println(f3.toString())
    println(f3.hashCode())

    println("===================")
    println(f1.equals(f3))

    println("===================")
    println(f4.toString())
    println(f5.toString())
    println(f4.equals(f5))

    println()
    println("=======================")
    println("     Com FormaData     ")
    println("=======================")
    println(f6.toString())
    println(f7.toString())
    println(f6.equals(f7))

    println()
    println("===================")
    println(f7.toString())
    println(f8.toString())
    println(f9.toString())
    println(f7.equals(f8))
    println(f7.equals(f9))

}

class FormaGeo(val a: Int, val b: Int)
data class FormaGeoData(val a: Int, val b: Int){

}

class FormaGeo2(val a: Int, val b: Int){
    override fun equals(other: Any?): Boolean {
        //return super.equals(other)
        if (other is FormaGeo2) {
            return other.a == this.a && other.b == this.b
        } else {
            return false
        }
    }

    override fun toString(): String {
        //return super.toString()
        return "${this.a} e ${this.b}"
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}

fun endereco(rua: String, numero: String, cidade: String, estado: String, cep: String){}

data class Endereco(val rua: String, val numero: String, val cidade: String, val estado: String, val cep: String)
fun novoEndereco(e: Endereco) {}