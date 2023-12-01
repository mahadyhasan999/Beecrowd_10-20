/*Read the four values corresponding to the x and y axes of two points in
 the plane, p1 (x1, y1) and p2 (x2, y2) and calculate the distance
  between them, showing four decimal places after the comma, according
   to the formula:

Distance = sqrt((x2-x10)*(x2-x10)+(y2-y1)(y2-y1))

Input
The input file contains two lines of data. The first one contains two double
 values: x1 y1 and the second one also contains two double values
  with one digit after the decimal point: x2 y2.

Output
Calculate and print the distance value using the provided formula,
 with 4 digits after the decimal point.*/

import kotlin.math.*
import java.util.*
//import kotlin.math.pow
//import kotlin.math.sqrt
//import java.lang.Math.sqrt

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val x1 = read.nextDouble()
    val y1 = read.nextDouble()
    val x2 = read.nextDouble()
    val y2 = read.nextDouble()

    val dist = ((x2-x1).pow(2)+(y2-y1).pow(2)).pow(0.5)

    println("%.4f".format(dist))
}