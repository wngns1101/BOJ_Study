class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
    (l..r).forEach{
        num -> if (num.toString().all { it == '5' || it == '0' }){
            answer += num
        }
    }
        if (answer.count() == 0){
            answer += -1
            return answer
        }else{
            return answer    
        }
    }
}