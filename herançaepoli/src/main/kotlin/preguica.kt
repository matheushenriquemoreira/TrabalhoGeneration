class preguica(
    especie: String,
    nome: String,
    idade: Int
) : animal(especie, nome, idade){

    override fun som() {
        println("uuuuooooo")
    }

    override fun subir() {
        println("subindo na arvore")
    }


    }





