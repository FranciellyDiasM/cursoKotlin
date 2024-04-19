package Loops

class forWhile {}

        fun main(args: Array<String>) {

//     var numero = 1
//    while (numero < 5){
//        println("Executado: $numero")
//        numero ++ // numero = numero + 1
//     }

         val postagens= arrayOf(
             "to estudando",
             "sera q vai dar bom?",
             "Vamos continuar" ,
             "bola pra frente"
         )

            for((indice, postagem) in postagens.withIndex()){
                println("$indice - $postagem")
            }

}