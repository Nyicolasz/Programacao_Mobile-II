fun main(args: Array<String>) {
    decisaoSimples(7.0)
    decisaoComposta(6.9)
    decisaoVariavel(2, 3)
    decisaoAninhada(9)
}

fun decisaoSimples(notaSimples: Double){
    if(notaSimples >= 7.0){
        println("Aprovado")
    }
}

fun decisaoComposta(notaComposta: Double){
    if(notaComposta >= 7.0){
        println("Aprovado")
    }else{
        println("Reprovado")
    }
}

fun decisaoVariavel(a: Int, b: Int){
    val maiorValor = if (a > b){
        a
    }else{
        b
    }
    println("O maior valor é $maiorValor")
}

fun decisaoAninhada(notaAninhada: Int){
    if (notaAninhada in 9 .. 10){
        println("Fantásico")
    }else if (notaAninhada in 7 .. 8){
        println("Parabén")
    }else if (notaAninhada in 4 .. 6){
        println("Tem como recuperar")
    }else if (notaAninhada in 0 .. 3) {
        println("Te vejo no pr[oximo ano")
    }else{
        println("Nota inválida")
    }
}