/*Read an integer value, which is the duration in seconds of a certain event in a factory,
 and inform it expressed in hours:minutes:seconds.

Input
The input file contains an integer N.

Output
Print the read time in the input file (seconds) converted in hours:minutes:seconds.*/

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    var N = read.nextInt()

    var remain = N % 3600
    var A = N - remain
    var hour = A / 3600
    N = remain

    remain = N % 60
    A = N - remain
    var minute = A / 60
    val second = remain

    println("$hour:$minute:$second")
}