abstract class animal(

    var especie: String,
    var nome: String,
    var idade: Int,
) {



    abstract fun som ()


    open fun correr (){}

    open fun subir (){}
}