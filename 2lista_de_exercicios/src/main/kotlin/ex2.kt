fun main(){

    //2- Faça um programa que entre com três números e coloque em ordem crescente.

    println("Digite 3 numeros: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    if (num1 > num2 && num2 > num3) {
        println("$num1 $num2 $num3")
    }else if (num2 > num1 && num1 > num3){
        println("$num2 $num1 $num3")
    }else if (num3 > num1 && num1 > num2){
        println("$num3 $num1 $num2")
    }else if (num1 > num3 && num3 > num2){
        println("$num1 $num3 $num2")
    }else if (num2 > num3 && num3 > num1){
        println("$num2 $num3 $num1")
    }else{
        println("$num3 $num2 $num1")
    }



}