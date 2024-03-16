package lambdas

fun main(args: Array<String>) {
    val numeros = arrayListOf(1,2,3,4,5)
    val string = arrayListOf("Rafael", "Pedro", "Leadro", "Gustavo")
    val uniao = numeros + string

    for(item in uniao){
        println(item)
    }
}