class Solution {
    fun solution(n: Int): IntArray {
var answer: IntArray = intArrayOf(n)
    var num = n
    while (num != 1){
        if (num % 2 == 0){
            num /= 2
            answer += num
            println(num)
        } else{
            num = 3 * num + 1
            answer += num
            println(num)
        }
    }
    return answer

    }
}