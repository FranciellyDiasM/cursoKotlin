package Heranca

  class Animal{
    fun dormir(){
        println("Dormir")
    }

  }
class Cao : Animal(){


}


class Passaro: Animal(){

}


fun main (args: Array<String>){

    val cao = Cao()
    cao.dormir()

    val passaro = Passaro()
    passaro.dormir()

}