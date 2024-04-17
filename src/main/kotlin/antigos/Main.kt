package antigos
fun exibirMensagem(nome: String){
    println("alerta, $nome")
}
fun somar(numero1: Int, numero2: Int) : Int {

    var total = numero1 + numero2
    return total
//    println(total)
}
fun main(args: Array<String>) {

 //   antigos.exibirMensagem("jamilton")
    var resulado = somar(10,5)
    println(resulado)



}