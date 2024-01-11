class Solution {
    fun solution(start_num: Int, end_num: Int): IntArray {
        var answer: IntArray = intArrayOf()
        (start_num..end_num).forEach { num -> answer += num }
        return answer
    }
}