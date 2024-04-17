package construtores

class Casa {

    // propriedades
    var cor: String = ""
    var vagasGaragem: Int = 0


    //Metodos
    fun detalhesCasa() {
        println("A casa tem a cor : $cor, vagas: $vagasGaragem")
    }

    fun abrirJanela(qtdJanelas: Int) {
        println("Abrir janelas total: $qtdJanelas")

    }

    fun abrirPorta() {
        println("Abrir porta.")
    }

    fun abrirCasa() {
        this.abrirPorta()
    }

}