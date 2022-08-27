/*import kotlin.math.pow
import kotlin.math.sqrt

fun soma(n1: Int, n2: Int): Int{
    return n1 + n2
}

fun subtração(n1: Int, n2: Int): Int{
    return n1 - n2
}
fun vezes(n1:Int, n2: Int): Int {
    return n1 * n2
}
fun divisao(n1:Int, n2: Int): Int {
    return n1 / n2
}
fun potencia(n1:Int, n2: Int): Double {
    return n1.toDouble().pow(n2)
}
fun raiz(n1:Int): Double {
    return sqrt(n1.toDouble())}


    Você se reveza para contar de 1 até .. infinito. Mas digamos 100.
Sempre que o número for
um múltiplo de 3, você deve dizer "Fizz" em vez do número
um múltiplo de 5, você deve dizer "Buzz" em vez do número
um múltiplo de 3 E 5, você deve dizer "Fizzbuzz" em vez do número
Seu código deve imprimir os números de 1 a 100, mas com Fizz, Buzz e Fizzbuzz nos lugares certos.

Boa sorte!


 */
fun main(){

    for(i in 1 .. 100)
    {
        when(i%3==0 && i%5==0){
            println("fizzBuzz")

                if(i%3==0){
                    i = kotlin.io.println("Fizz")
                else if(i%5==0){
                    i = kotlin.io.print("Buzz")
            }
            }

        }


    }






}
