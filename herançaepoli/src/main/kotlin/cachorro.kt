

class cachorro(
    especie: String,
    nome: String,
    idade: Int
) : animal(especie, nome, idade){

    override fun som() {
        println("auau")
    }

    override fun correr() {
        println("correr como um dog")
    }


    }


