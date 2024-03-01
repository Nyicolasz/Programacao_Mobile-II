fun main(args: Array<String>) {
    var contador: Int = 1
    while(contador <= 10){
        println(contador)
        contador++
    }

    var opcao: Int = 0
    while(opcao != 1){
        print("Digite um número: ")
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolheu a opção $opcao")

        if(opcao == 1){
            print("Encerrando...")
        }
    }
}