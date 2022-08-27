import kotlin.math.pow

fun main(){



    /*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
      *      número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
       * ímpar exiba o número elevado ao quadrado.    */

println("Digite um numero: ")
    val numero = readln().toInt()
    val raiz = numero.toDouble().pow(0.5)



    if((numero %2) == 0){
        println("O numero $numero é par e o valor da raiz quadrada é ${"%.2f".format(raiz)} ")
    }else{
        println("O numero $numero é impar e seu resultado ao quadrado é ${numero.toDouble().pow(2)} ")
    }






}