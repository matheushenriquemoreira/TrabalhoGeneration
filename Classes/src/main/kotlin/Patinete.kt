fun main (){

println("qual tamanho do patinete? ")
    var tamanho = readln().toInt()
    println("qual cor deseja? ")
    var cor = readln()
    println("eletrico ou convencional")
    var eletrico = readln()
    println("qual velocidade voce quer andar: ")
    val velocidade = readln()

    val patinete = Pessoapatinete (tamanho, cor, eletrico)

    patinete.nivel()



}