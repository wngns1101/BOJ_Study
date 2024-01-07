import kotlin.math.pow
class Solution {
    fun solution(num_list: IntArray): Int {
        var answer: Int = 0
        var numListMul = 1
        for (i in num_list){
            numListMul = numListMul * i
        }
        var numListSum = num_list.sum().toFloat().pow(2).toInt()
        
        if (numListMul < numListSum){
            answer = 1
        }else{
            answer = 0
        }
        return answer
    }
}