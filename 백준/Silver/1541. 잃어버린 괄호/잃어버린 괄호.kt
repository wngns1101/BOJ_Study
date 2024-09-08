fun main() {
    val nums = readln()
    val splitNums = nums.split("-")
    
    // 첫 번째 부분은 모두 더함
    var result = splitNums[0].split("+").sumOf { it.toInt() }
    
    // 이후 부분은 각각 더한 뒤 빼기
    for (i in 1 until splitNums.size) {
        val sumMinus = splitNums[i].split("+").sumOf { it.toInt() }
        result -= sumMinus
    }
    
    println(result)
}
