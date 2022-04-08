/*
In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1,
the code of a product 2, the number of units of product 2 and the price for one unit of product 2.
After this, calculate and show the amount to be paid.
 */

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