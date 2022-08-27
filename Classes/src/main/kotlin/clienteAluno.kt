fun main() {


    println("Digite o nome do aluno?")
    var nome = readln()
    println("Digite o cpf do aluno:")
    val cpf = readln()


    println("Digite a idade do aluno:")
    val idade = readln().toInt()
    println("Digite o sexo do aluno:")
    val sexo = readln()

    println("Digite a nota de portugues")
    var notapor = readln().toDouble()
    println("Digite a nota de matematica")
    var notamat = readln().toDouble()
    println("Digite a nota de geografia")
    var notageo = readln().toDouble()




    val aluno1 = Cliente(nome, cpf, idade, sexo, notapor, notamat, notageo)

    aluno1.mediafinal()


    


}


