fun main(args: Array<String>) {
    decrescente()
    println("")
    comPasso()
}

fun decrescente(){
    for(i in 10 downTo 1){
        println("i = $i")
    }
}

fun comPasso(){
    for(i in 0 .. 20 step 5){
        println("i = $i")
    }
}