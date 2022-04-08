/*
Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1) and p2 (x2, y2) and
calculate the distance between them, showing four decimal places after the comma, according to the formula:
sqrt((x2 - x1)^2 + (y2 - y1)^2)
 */

import java.util.*
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val x1 = sc.next().toDouble()
    val y1 = sc.next().toDouble()

    val x2 = sc.next().toDouble()
    val y2 = sc.next().toDouble()

    val dist = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println(String.format("%.4f", dist).replace(",", "."))
}
