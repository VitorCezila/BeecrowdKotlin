import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val code1 = sc.next().toInt()
    val qtdPart1 = sc.next().toInt()
    val value1 = sc.next().toFloat()

    val code2 = sc.next().toInt()
    val qtdPart2 = sc.next().toInt()
    val value2 = sc.next().toFloat()

    val total = (qtdPart1 * value1) + (qtdPart2 * value2)

    println("VALOR A PAGAR: R$ ${String.format("%.2f", total).replace(",", ".")}")

}