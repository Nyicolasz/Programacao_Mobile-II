package funcoes_exemplos

inline fun  transacao (funcao: () -> Unit){
    println("Abrindo transação...")

    try {
        funcao()
    }finally {
        println("Fechamento transação")
    }
}
fun main(args: Array<String>) {
    transacao {
        println("Execultando SQL 1...")
        println("Execultando SQL 2...")
        println("Execultando SQL 3...")
    }
}