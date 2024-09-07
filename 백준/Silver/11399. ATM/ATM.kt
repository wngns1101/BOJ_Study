fun main() {
    val index = readln().toInt()
    val nums = readln().split(" ").map{it.toInt()}
    val sortedNums = nums.sorted()
    var result = 0
    for (i in 0 until index) {
        for (j in 0..i){
            result += sortedNums[j]
        }
    }
    println(result)
}