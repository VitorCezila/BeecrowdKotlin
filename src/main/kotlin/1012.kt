/*
Make a program that reads three floating point values: A, B and C. Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of ​​the square that has side B.
e) the area of the rectangle that has sides A and B.
 */

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val a = sc.next().toFloat()
    val b = sc.next().toFloat()
    val c = sc.next().toFloat()
    val pi = 3.14159

    val areaTriangulo = (a * c) / 2

    val areaCirculo = (pi * c.pow(2))

    val areaTrapezio = (a + b) * c / 2

    val areaQuadrado = b * b

    val areaRetangulo = a * b


    println("TRIANGULO: ${String.format("%.3f", areaTriangulo).replace(",", ".")}")
    println("CIRCULO: ${String.format("%.3f", areaCirculo).replace(",", ".")}")
    println("TRAPEZIO: ${String.format("%.3f", areaTrapezio).replace(",", ".")}")
    println("QUADRADO: ${String.format("%.3f", areaQuadrado).replace(",", ".")}")
    println("RETANGULO: ${String.format("%.3f", areaRetangulo).replace(",", ".")}")
}