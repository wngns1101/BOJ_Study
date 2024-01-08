class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr
        for ((pre, post) in queries){
            val temp = arr[pre]
            arr[pre] = arr[post]
            arr[post] = temp
        }
        return answer
    }
}