package ModAcesso
/* private -> visivel apenas dentro da classe
* public -> visivel em todo lugar, caso nao seja definido é o padrão
* protect -> funciona como o private, mas é visivel em subclasses
* internal -> lembra o public, mas sua visibiladeda é restringida ao modulo, sendo então visivel
* dentro de um memso modulo */

class ModAcesso {

    open class Animal{
        //private,protect, public
        var nome = "marley"

        fun dormir(){
            println("Dormir")
        }
    }
    class Cao: Animal(){
        fun exibeNome(){
            println("Metodo exibe nome: $nome")
        }
    }



//  MAIN
    fun main(args: Array<String>){

    val animal = Animal()
    println(animal.nome)


    }























}