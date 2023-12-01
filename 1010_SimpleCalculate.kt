/*
 In this problem, the task is to read a code of a product 1, the number of units of product 1,
  the price for one unit of product 1, the code of a product 2, the number of units of product 2 and
   the price for one unit of product 2. After this, calculate and show the amount to be paid.

Input
The input file contains two lines of data. In each line there will be 3 values: two integers and
  a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay.
 Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.
*/

import java.util.*

fun main(args: Array<String>) {
     val read = Scanner(System.`in`)
    val  pc1 = read.nextInt()
    val pu1 = read.nextInt()
    val pup1 = read.nextDouble()

    val  pc2 = read.nextInt()
    val pu2 = read.nextInt()
    val pup2 = read.nextDouble()

    val value = ((pu1*pup1) + (pu2*pup2))

    println("VALOR A PAGAR: R$ %.2f".format(value))

}