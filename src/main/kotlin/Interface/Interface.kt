package Interface

class Interface {}

interface Presidente {
    fun ganharEleicao()
}

interface Pai {
    fun temFilho()
}

open class Cidadao {
    fun direitosEdeveres() {
        println("Todo cidadão tem direitos e deveres")
    }
}

class Obama : Cidadao(), Presidente, Pai {
    override fun ganharEleicao() {
        println("Ganhar eleição nos EUA")
    }

    override fun temFilho() {
        println("Tem filho")
    }
}

class Jamilton : Cidadao(), Presidente {
    override fun ganharEleicao() {
        println("Ganhar eleição no Brasil.")

    }
}

fun main(args: Array<String>) {

    var jamilton = Jamilton()
    jamilton.direitosEdeveres()

    var obama = Obama()
    obama.direitosEdeveres()
    obama.ganharEleicao()
    obama.temFilho()
}