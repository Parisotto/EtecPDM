// Aula 2: Variáveis e tipos de dado

fun main() {
    val umByte: Byte = 127 // 1 byte ou 8 bits: -128 a 127
    val umShort: Short = 32767 // 2 bytes ou 16 bits: -32768 a 32767
    val umInt: Int = 2147483647 // 4 bytes ou 32 bits:  -2147483648 a 2147483647
    val umLong: Long = 9223372036854775807L // 8 bytes ou 64 bits: -9223372036854775808 a 9223372036854775807

    val umFloat: Float = 3.4028235E38f // 4 bytes ou 32 bits: 1.4E-45 a 3.4028235E38
    val umDouble: Double = 1.7976931348623157E308 // 8 bytes ou 64 bits: 4.9E-324 a 1.7976931348623157E308

    val umBoolean: Boolean = true // 1 bit: 0 ou 1
    val umChar: Char = 'a' // 1 byte ou 8 bits
    val umString: String = "Cadeia de caracteres." // Tamanho indefinido.

    println("Byte MIN ${Byte.MIN_VALUE} - MAX ${Byte.MAX_VALUE}")
    println("Short MIN ${Short.MIN_VALUE} - MAX ${Short.MAX_VALUE}")
    println("Int MIN ${Int.MIN_VALUE} - MAX ${Int.MAX_VALUE}")
    println("Long MIN ${Long.MIN_VALUE} - MAX ${Long.MAX_VALUE}")

    println("Float MIN ${Float.MIN_VALUE} - MAX ${Float.MAX_VALUE}")
    println("Double MIN ${Double.MIN_VALUE} - MAX ${Double.MAX_VALUE}")

    val umUByte: UByte = 255u // 1 byte ou 8 bits: 0 a 255
    val umUShort: UShort = 32767u // 2 bytes ou 16 bits: 0 a 65535
    val umUInt: UInt = 2147483647u // 4 bytes ou 32 bits: 0 a 4294967295
    val umULong: ULong = 9223372036854775807u // 8 bytes ou 64 bits: 0 a 18446744073709551615

    println("UByte MIN ${UByte.MIN_VALUE} - MAX ${UByte.MAX_VALUE}")
    println("UShort MIN ${UShort.MIN_VALUE} - MAX ${UShort.MAX_VALUE}")
    println("UInt MIN ${UInt.MIN_VALUE} - MAX ${UInt.MAX_VALUE}")
    println("ULong MIN ${ULong.MIN_VALUE} - MAX ${ULong.MAX_VALUE}")
}
