class Cliente (
    val nome:       String,
    val cpf:        String,
    val idade:      Int,
    val sexo:       String,



    ) {
    var notapor = 0.0
    var notamat = 0.0
    var notageo = 0.0

    constructor(
        nome: String,
        cpf: String,
        idade: Int,
        sexo: String,
        notapor: Double,
        notamat: Double,
        notageo: Double
    ) : this(nome, cpf, idade, sexo) {
        this.notapor = notapor.toDouble()
        this.notamat = notamat.toDouble()
        this.notageo = notageo.toDouble()
    }


    fun mediafinal() {
        if ((notageo + notamat + notapor)/3 >= 6) {
            println("voçe esta aprovado")

        } else {
            println("voce foi reprovado")
        }
    }
}


