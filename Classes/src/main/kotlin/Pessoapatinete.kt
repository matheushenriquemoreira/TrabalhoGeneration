class Pessoapatinete (
    var tamanho: Int,
    var cor: String,
    var eletrico: String

        ) {
    var velocidade: Double = 0.0

    constructor(
        tamanho: Int,
        cor: String,
        eletrico: String,
        velocidade: Double
    ) : this(tamanho, cor, eletrico) {
        this.velocidade = velocidade

    }

    fun nivel() {
        if (velocidade <= 20) {
            println("velocidade baixa")
        } else if (velocidade >= 21 && velocidade <= 40) {
            println("velocidade media")
        } else {
            println("cuidado voçe esta em alta velocidade")
        }


    }
}