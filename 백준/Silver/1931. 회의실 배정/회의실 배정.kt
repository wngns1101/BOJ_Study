fun main () {
    val index = readln().toInt()
    val arr = Array(index) {Array(2) {0}}

    repeat(index) {
        val nums = readln().split(" ").map { it.toInt() }
        arr[it][0] = nums[0]
        arr[it][1] = nums[1]
    }

    arr.sortWith(compareBy( {it[1]}, {it[0]} ))

    var time = arr[0][1]
    var result = 0
    for (i in 1 until arr.size) {
        if (time <= arr[i][0]) {
            time = arr[i][1]
            result += 1
        }
    }
    println(result+1)
}