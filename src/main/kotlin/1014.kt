/*
Calculate a car's average consumption being provided the total distance traveled (in Km) and the spent fuel total (in liters).
*/

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val km = sc.next().toInt()
    val fuel = sc.next().toFloat()

    println(String.format("%.3f", km / fuel).replace(",", ".") + " km/l")


}