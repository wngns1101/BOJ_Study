class Solution {
    fun solution(numLog: IntArray): String {
        var answer: String = ""
        var num = numLog[0]
        for (n in 1..numLog.size-1){
            val temp = numLog[n] - num
            when (temp) {
                1 -> { answer += 'w'; num += 1}
                -1 -> { answer += 's'; num -= 1}
                10 -> { answer += 'd'; num += 10}
                -10 -> { answer += 'a'; num -= 10}
            }
        }
        return answer
    }
}