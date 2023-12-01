/*Make a program that calculates and shows the volume of a sphere being provided the value of its radius (R) .
 The formula to calculate the volume is: (4/3) * pi * R3. Consider (assign) for pi the value 3.14159.

Tip: Use (4/3.0) or (4.0/3) in your formula, because some languages (including C++) assume that
 the division's result between two integers is another integer. :)

Input
The input contains a value of floating point (double precision).

Output
The output must be a message "VOLUME" like the following example with a space before and after the equal signal.
 The value must be presented with 3 digits after the decimal point.*/

import java.util.Scanner

fun main(args: Array<String>) {
    val read = Scanner(System.`in`)
    val pi = 3.14159
    val R = read.nextDouble()
    var volumeofsphere = (4.0/3.0)*pi*R*R*R

    println("VOLUME =  %.3f".format(volumeofsphere))
}