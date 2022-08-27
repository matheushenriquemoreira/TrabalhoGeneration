fun main(){
    //2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

      var num = 0
    var par = 0
    var impar = 0
    for(i in 1..10){
        println("Digite um numero: ")
         num = readln().toInt()

        if (num%2==0){
            par++
        }else{
            impar++
        }



    }
    println("A quantidade de numeros pares são $par e impares são $impar")








}