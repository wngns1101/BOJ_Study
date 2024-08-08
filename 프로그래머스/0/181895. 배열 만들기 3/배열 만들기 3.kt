class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        for (i in intervals) {
            answer += arr.slice(i[0]..i[1])
        }
        return answer
    }
}