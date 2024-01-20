class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for(str in intStrs){
            val sliceNum = str.substring(s, s+l).toInt()
            if(sliceNum > k){
                answer += sliceNum
            }
        }
        
        return answer
    }
}