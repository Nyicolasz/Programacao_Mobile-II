fun main(args: Array<String>) {
    for(i in 1 .. 10){
        if (i == 5){
            break
        }
        println("Atual: $i")
    }

    println("")

    loop@for (i in 1 .. 10){
        for (j in 1 .. 10){
            if (i == 2 && j == 5) break@loop
            println("$i $j")
        }
    }
}