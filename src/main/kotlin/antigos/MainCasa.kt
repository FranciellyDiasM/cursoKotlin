package antigos

import antigos.Casa

fun main(args: Array<String>) {
    val casa =  Casa()
    casa.cor = "Amarela"
    casa.abrirJanela(10)
    val casa2 = Casa()
    casa2.cor = "Vermelho"

    println(casa.cor)
    println(casa2.cor)
    println()



}