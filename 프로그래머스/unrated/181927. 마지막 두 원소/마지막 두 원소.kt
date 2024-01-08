class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list
        val lastElement = num_list[num_list.count()-1]
        val lessElement = num_list[num_list.count()-2]
        answer += ( if(lastElement > lessElement) lastElement - lessElement else lastElement * 2 )
        return answer
    }
}