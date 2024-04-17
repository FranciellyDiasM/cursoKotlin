package antigos

class Casa {

    // propriedades
    var cor : String = ""

    //Metodos
    fun abrirJanela(qtdJanelas : Int){
        println("Abrir janelas total: $qtdJanelas")

    }

    fun abrirPorta (){
        println("Abrir porta.")
    }

    fun abrirCasa (){
        this.abrirPorta()
    }

}

fun main (args: Array<String>){

    val casa = Casa()
    casa.cor = "Amarela"
    casa.abrirJanela(10)
/*
    val casa2 = antigos.Casa()
    casa2.cor = "Vermelha"
*/
    println(casa.cor)
    //println(casa2.cor)

}