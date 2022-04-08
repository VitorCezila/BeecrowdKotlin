/*
Make a program that reads 3 integer values and present the greatest one followed by the message "eh o maior".
Use the following formula: (a + b + abs(a - b)) / 2
 */

import java.util.*
import kotlin.math.abs

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val a = sc.next().toInt()
    val b = sc.next().toInt()
    val c = sc.next().toInt()

    var maior = (a + b + abs(a - b)) / 2
    maior = (c + maior + abs(maior - c)) / 2

    println("$maior eh o maior")

}