class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = IntArray(52)
        my_string.map{
            it -> if (it.isLowerCase()) {
                answer[it -'a' + 26] += 1
            }else if (it.isUpperCase()){
                answer[it - 'A'] += 1
            }
        }
        return answer
    }
}