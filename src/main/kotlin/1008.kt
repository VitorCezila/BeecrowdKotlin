import java.util.*

fun main(args: Array<String>) {

    /**
     * Escreva a sua solução aqui
     * Code your solution here
     * Escriba su solución aquí
     */

    val sc = Scanner(System.`in`)

    val funcNum = sc.next().toInt()
    val workHour = sc.next().toInt()
    val payHour = sc.next().toDouble()

    val salary = workHour * payHour

    println("NUMBER = $funcNum")
    println("SALARY = U$ ${String.format("%.2f", salary).replace(",", ".")}")


}