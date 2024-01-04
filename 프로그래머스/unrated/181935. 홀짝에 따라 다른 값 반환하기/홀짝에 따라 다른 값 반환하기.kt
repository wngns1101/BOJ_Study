class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        if (n % 2 == 1){
            for (i in 1 until n+1){
                if (i % 2 == 1){
                    answer += i
                }
            }
        }else{
            for (i in 1 until n+1){
                if (i % 2 == 0){
                    answer += i * i
                }
            }
        }
        return answer
    }
}