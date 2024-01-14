class Solution {
    fun solution(number: String): Int {
        var answer: Int = 0
        for (num in number){
            answer += num.toInt()-48
        }
        return answer % 9
    }
}