class Solution {
    fun solution(start_num: Int, end_num: Int): List<Int> {
        var answer: IntArray = intArrayOf()
        
        for (i: Int in end_num..start_num) {
            answer += i
        }
        
        return answer.reversed()
    }
}