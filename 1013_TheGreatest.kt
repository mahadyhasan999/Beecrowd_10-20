/*Make a program that reads 3 integer values and present the greatest one
 followed by the message "eh o maior". Use the following formula:
                                maiorAB = ((a+b)+(abs(a-b)))/2

Input
The input file contains 3 integer values.

Output
Print the greatest of these three values followed by a space and the message “eh o maior”.*/

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)

    var a = read.nextInt()
    var b = read.nextInt()
    var c = read.nextInt()

    var maiorAB = (a + b + Math.abs(a - b)) / 2
    var max = (maiorAB + c + Math.abs(maiorAB - c)) / 2

    println("$max eh o maior")
}