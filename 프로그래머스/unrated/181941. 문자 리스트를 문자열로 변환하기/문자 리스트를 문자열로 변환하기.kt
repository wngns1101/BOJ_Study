class Solution {
    fun solution(arr: Array<String>): String {
        var answer: String = ""
        arr.map{a -> answer += a}
        return answer
    }
}