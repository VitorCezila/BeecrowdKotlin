import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val raio = sc.next().toDouble()
    val pi = 3.14159

    val volume = (4.0/3) * pi * raio.pow(3)
    println("VOLUME = ${String.format("%.3f", volume).replace(",", ".")}")

}