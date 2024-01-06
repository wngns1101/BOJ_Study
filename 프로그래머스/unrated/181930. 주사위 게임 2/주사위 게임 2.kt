import kotlin.math.pow
class Solution {
    fun solution(a: Int, b: Int, c: Int): Int {
        var answer: Int = 0
        var setNums = setOf(a, b, c)
        when (setNums.count()){
            3 -> answer = (a + b + c)
            2 -> answer = (a + b + c) * (a.toFloat().pow(2).toInt() + b.toFloat().pow(2).toInt() + c.toFloat().pow(2).toInt())
            1 -> answer = (a + b + c) * (a.toFloat().pow(2).toInt() + b.toFloat().pow(2).toInt() + c.toFloat().pow(2).toInt()) * ((a.toFloat().pow(3).toInt() + b.toFloat().pow(3).toInt() + c.toFloat().pow(3).toInt()))
        }
        return answer
    }
}