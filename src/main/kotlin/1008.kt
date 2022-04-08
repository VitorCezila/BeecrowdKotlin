/*
Write a program that reads an employee's number, his/her worked hours number in a month and the amount he received per hour.
Print the employee's number and salary that he/she will receive at end of the month, with two decimal places.
 */

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)

    val funcNum = sc.next().toInt()
    val workHour = sc.next().toInt()
    val payHour = sc.next().toDouble()

    val salary = workHour * payHour

    println("NUMBER = $funcNum")
    println("SALARY = U$ ${String.format("%.2f", salary).replace(",", ".")}")


}