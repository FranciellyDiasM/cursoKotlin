package construtores

class Casa (var cor : String, var vagasGaragem : Int ) {

    // propriedades
   /* var cor: String = ""
    var vagasGaragem: Int

    constructor(cor : String, vagasGaragem : Int){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }

    init{
        this.cor = cor
        this.vagasGaragem = vagasGaragem

    }
    */

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