class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr
        for (q: Int in 0 until query.size) {
            if (q % 2 == 0) {
                answer = answer.slice(0..query[q]).toIntArray()   
            } else {
                answer = answer.slice(query[q] until answer.size).toIntArray()
            }
        }
        return answer
    }
}