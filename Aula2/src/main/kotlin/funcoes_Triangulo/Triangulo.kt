
package funcoes_Triangulo



fun main(args: Array<String>) {
  Menu()
}

fun Menu(){

    println("Selecione uma opção: " +
            "\n 1 - ÁREA DO RETÂNGULO \n " +
            "2 - TRIANGULO EQUILÁTERO \n" +
            "3 - TRIÂNGULO ISÓCELES \n" +
            "4 - TRIÂNGULO ESCALENO \n" +
            "5 - ÁREA DA CIRCUFERÊNCIA \n" +
            "6 - ÁREA DO LOSANGO \n" +
            "7 - ÁREA DO TRAPÉZIO")

    var opcao = readLine()!!.toInt()

    if (opcao == 1){
        AREA_RETANGULO()
    }
    else if (opcao == 2){
        TRIANGULO_EQUILATERO()
    }
    else if (opcao == 3){
        TRIANGULO_ISOCELES()
    }
    else if (opcao == 4){
        TRIANGULO_ESCALENO()
    }
    else if (opcao == 5){
        AREA_CIRCUFERENCIA()
    }
    else if (opcao == 6){
        AREA_LOSANGO ()
    }
    else if (opcao == 7){
        AREA_TRAPEZIO()
    }
    else{
        println("Essa opção não existe")
    }
}

fun AREA_RETANGULO(){

    println("Digite a base")
    var b = readLine()!!.toDouble()
    println("Digite a altura")
    var a = readLine()!!.toDouble()

    var resultado = b * a
    println(resultado)
}

fun TRIANGULO_EQUILATERO(){

    println("Digite o lado")
    var lado = readLine()!!.toDouble()

    var resultado = ((lado * lado) * Math.sqrt(3.0)) / 4.0
    println(resultado)
}

fun TRIANGULO_ESCALENO(){

    println("Digite a base")
    var b = readLine()!!.toDouble()

    println("Digite a altura")
    var a = readLine()!!.toDouble()

    var resultado = ( b * a) / 2
    println(resultado)
}

fun TRIANGULO_ISOCELES(){

    println("Digite a base")
    var b = readLine()!!.toDouble()

    println("Digite a altura")
    var a = readLine()!!.toDouble()

    var resultado = ( b * a) / 2
    println(resultado)
}

fun AREA_CIRCUFERENCIA(){

    println("Digite o raio")
    var r = readLine()!!.toDouble()

   var resultado = Math.PI * (r * r)

    println(resultado)
}

fun AREA_LOSANGO (){

    println("Digite a diagonal 1")
    var d1 = readLine()!!.toDouble()
    println("Digite a diagonal 2")
    var d2 = readLine()!!.toDouble()

    var resultado = (d1 * d2)/2

    println(resultado)
}

fun AREA_TRAPEZIO (){

    println("Digite a base maior")
    var B = readLine()!!.toDouble()
    println("Digite a base menor ")
    var b = readLine()!!.toDouble()
     println("Digite a altura ")
    var h = readLine()!!.toDouble()

    var resultado = ((B+b)*h)/2

    println(resultado)
}
