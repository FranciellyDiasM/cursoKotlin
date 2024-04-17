package construtores


fun main(args: Array<String>) {

    val casa = Casa()
    casa.cor = "Amarela"
    casa.vagasGaragem = 2
    casa.abrirJanela(10)

    casa.detalhesCasa()

    println(casa.cor)
    // println(casa2.cor)

}
