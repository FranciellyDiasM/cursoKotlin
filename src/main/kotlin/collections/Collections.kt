package collections

class Collections {}



fun main(args: Array<String>){

    var listaItens = arrayListOf<String>("SP","ES","RJ")
    listaItens.add("MG")
//    listaItens[0] = "BA"
    listaItens.remove("SP")
//    listaItens.removeAt(0)

    println(listaItens)
    println(listaItens.size)
    println(listaItens.isEmpty())
}