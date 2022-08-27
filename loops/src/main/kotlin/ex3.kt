fun main(){
    /*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
*21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
*idade for =-99. (WHILE)
*/
    var senhor = 0
    var jovem = 0
    var idade = 0




    while (idade != -99) {
        println("Digite a sua idade: ")
         idade = readln().toInt()

        if (idade <= 21) {
            jovem++
        }else if (idade >= 50) {
            senhor++
        }
        }
    println("O total de pessoas com menos de 21 anos é $jovem e de pessoas com mais de 50 é $senhor")
    }









