class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        for (index in 0..included.count()-1){
            if (included[index] == true){
                answer += d * index + a
            }
        }
        return answer
    }
}