/*Make a program that reads three floating point values: A, B and C.
 Then, calculate and show:
a) the area of the rectangled triangle that has base A and height C.
b) the area of the radius's circle C. (pi = 3.14159)
c) the area of the trapezium which has A and B by base, and C by height.
d) the area of the square that has side B.
e) the area of the rectangle that has sides A and B.

Input
The input file contains three double values with one digit after the decimal point.

Output
The output file must contain 5 lines of data. Each line corresponds to one of the areas described above,
 always with a corresponding message (in Portuguese) and one space between the two points and the value.
  The value calculated must be presented with 3 digits after the decimal point.*/

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val pi = 3.14159
    val A = read.nextDouble()
    val B = read.nextDouble()
    val C = read.nextDouble()

    val areaOfRectangledTriangle = (A*C)/2
    val areaOfcircle = pi*C*C
    val areaOfTrapezium = (C*(A+B))/2
    val areaOfSquare = B*B
    val areaOfReactangle = A*B


    println("TRIANGULO: ${"%.3f".format(areaOfRectangledTriangle)}\nCIRCULO: ${"%.3f".format(areaOfcircle)}\nTRAPEZIO: ${
        "%.3f".format(areaOfTrapezium)}\nQUADRADO: ${" % .3f".format(areaOfSquare)}\nRETANGULO: ${" % .3f".format(areaOfReactangle)}")

//    println("TRIANGULO: %.3f".format(areaOfRectangledTriangle))
//    println("CIRCULO: %.3f".format(areaOfcircle))
//    println("TRAPEZIO: %.3f".format(areaOfTrapezium))
//    println("QUADRADO: %.3f".format(areaOfSquare))
//    println("RETANGULO: %.3f".format(areaOfReactangle))

}