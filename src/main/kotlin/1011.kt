/*
Make a program that calculates and shows the volume of a sphere being provided the value of its radius (R) .
The formula to calculate the volume is: (4/3) * pi * R3. Consider (assign) for pi the value 3.14159.
 */

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val raio = sc.next().toDouble()
    val pi = 3.14159

    val volume = (4.0/3) * pi * raio.pow(3)
    println("VOLUME = ${String.format("%.3f", volume).replace(",", ".")}")

}