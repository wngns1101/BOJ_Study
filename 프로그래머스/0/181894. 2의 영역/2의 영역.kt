class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()

        arr.mapIndexed {
                index, value -> if (value == 2) answer += index else null
        }
    
        if (answer.isEmpty()) {
            return intArrayOf(-1)
        } else {
            val less = answer.minOrNull()
            val more = answer.maxOrNull()
            return arr.slice(less!!..more!!).toIntArray()
        }
    }
}