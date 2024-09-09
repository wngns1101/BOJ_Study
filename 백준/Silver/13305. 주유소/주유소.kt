fun main() {
    val index = readln().toInt()
    val litters = readln().split(" ").map{it.toInt()}
    val cities = readln().split(" ").map{it.toInt()}
    
    var answer = 0
    var currentPrice = cities[0]

    for(i in 0 until litters.size) {
        var nextPrice = cities[i+1]
        if (currentPrice < nextPrice) {
            answer += currentPrice * litters[i]
        } else {
            answer += currentPrice * litters[i]
            currentPrice = nextPrice
        }
    }
    
    println(answer)
}