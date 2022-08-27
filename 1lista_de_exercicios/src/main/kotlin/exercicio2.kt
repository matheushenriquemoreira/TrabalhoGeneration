fun main(){



    //2 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele

println("Digite o diâmetro do circulo:")
    val diametro = readln().toFloat()
    val pi = 3.14
    val raio = (diametro/2)

    println ("A area do circulo é ${pi*(raio*raio)} e o perimetro é ${(2*pi)*raio}")


}