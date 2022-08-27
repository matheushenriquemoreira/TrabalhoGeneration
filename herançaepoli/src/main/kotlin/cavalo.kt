class cavalo(
     especie: String,
     nome: String,
     idade: Int
) : animal(especie, nome, idade){

    override fun som() {
        println("miau")
    }

    override fun correr() {
        println("correr como um cachorro")
    }



}

