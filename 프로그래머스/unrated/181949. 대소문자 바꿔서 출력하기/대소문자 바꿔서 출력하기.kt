fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    for (s in s1){
        when (s){
            s.lowercaseChar() -> print(s.uppercase())
            s.uppercaseChar() -> print(s.lowercase())
        }
    }
}