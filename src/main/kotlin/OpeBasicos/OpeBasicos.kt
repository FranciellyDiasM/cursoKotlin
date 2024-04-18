package OpeBasicos

class OpeBasicos {}

fun main(args: Array<String>) {
    // % mostra o resto de uma divisão
    var numero1 = 39
    var numero2 = 5
    var resultadoDiv = numero1 % numero2

    println(resultadoDiv)

    //if else na variavel
    var media = 8
    var resultado = if (media >= 6) "Aprovado" else "Reprovado"

    println(resultado)

    // when
    var opcao = 2
    var resultadoWhen = when (opcao) {
        1 -> "Café puro"
        2 -> "chocolate quente"
        else -> "Nenhuma opção"
    }
    println(resultadoWhen)

    // Null Safety  // colocar '?' para aceitar texto 'null'
    var texto: String? = null
//    texto = "Francielly"

    println(texto?.length)


}
