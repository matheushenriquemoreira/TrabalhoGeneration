fun main(){
   // 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

    println("Digite tres numeros: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

        if (num1 > num2 && num1 > num3){
            println("O maior numero digitado foi o $num1")
        }else if(num2 > num1 && num2 > num3){
            println("O maior numero digitado foi o $num2")}
    else {
            println("O maior numero digitado foi o $num3")
        }







}