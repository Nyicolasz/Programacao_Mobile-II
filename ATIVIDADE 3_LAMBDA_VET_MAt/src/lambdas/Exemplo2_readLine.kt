package lambdas

fun multiplica(X: Int, Y: Int ): Int {
    return X+Y;
}

fun main(args: Array<String>) {
    println("Digite o primeiro numero:")
    val X = readLine()!!.toInt()


    println("Digite o segundo numero:")
    val Y = readLine()!!.toInt()

    val resultado = multiplica(X,Y)

    println("O resultado da soma é = $resultado")
}