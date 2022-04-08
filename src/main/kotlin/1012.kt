/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
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