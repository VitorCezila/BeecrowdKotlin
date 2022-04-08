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