package collections

class Collections {}


enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO
}

class Pedido {
    var status: StatusPedido = StatusPedido.PROCESSANDO

}


fun main(args: Array<String>) {

    var listaItens = arrayListOf<String>("SP", "ES", "RJ")
    listaItens.add("MG")
//    listaItens[0] = "BA"
    listaItens.remove("SP")
//    listaItens.removeAt(0)


    println(listaItens)
    println(listaItens.size)
    println(listaItens.isEmpty())


//    var itens = hashSetOf("a","b","c","c") //não mostra repetidos
//    var itens = hashSetOf("10","20","30","70") // não põe em ordem
    var map = hashMapOf(
        "urso" to "Animal que hiberna",
        "Cão" to "melhor amigo do homem"
    )

    map.put("passaro", "gosta de voar")
    map.remove("passaro")
    for (item in map) {

        println(item)
    }
//    println(map)

//    for(item in itens){
//        println(item)
//    }

    // ENUM -

    val pedido = Pedido()
    pedido.status = StatusPedido.APROVADO

    if (pedido.status == StatusPedido.PROCESSANDO) {
        println("Pedido esta sendo procesado")
    } else if (pedido.status == StatusPedido.APROVADO) {
        println("Pedido foi aprovado.")
    }
}