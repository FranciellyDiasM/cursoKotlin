package Heranca

    // open para liberar essa classe p ser heranca
  open class Animal{
        // open para liberar o metodo
    open fun dormir(){
        println("Dormir")
    }
        fun correr(){
            println("correr")
        }

  }
class Cao : Animal(){
    // override -> para sobreescrever um metodo / precisa por open no metodo para liberar para ser sobreescrito
    override fun dormir(){
        super.dormir()  /* chama a classe pai e incrementa o dormir  */
        println(" como um cão.")
    }
    fun latir(){
        println("Latir")
    }
}

class Passaro: Animal(){

}

fun main (args: Array<String>){

    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()

    val passaro = Passaro()
    passaro.dormir()

}