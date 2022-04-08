/*
Make a program that reads a seller's name, his/her fixed salary and the sale's total made by himself/herself in the month (in money).
Considering that this seller receives 15% over all products sold,
write the final salary (total) of this seller at the end of the month , with two decimal places.
 */

import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    val name = sc.next()
    val salary = sc.next().toDouble()
    val totalSales = sc.next().toDouble()

    val comission = totalSales * 0.15
    val total = comission + salary

    println("TOTAL = R$ ${String.format("%.2f", total).replace(",", ".")}")

}