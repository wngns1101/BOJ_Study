fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val temp = a % 2
    when(temp){
        0 -> println("${a} is even")
        else -> println("${a} is odd")
    }
}