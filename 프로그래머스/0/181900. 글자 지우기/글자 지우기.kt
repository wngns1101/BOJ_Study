class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: String = ""
        
        my_string.mapIndexed {
          index, value ->  if (index !in indices) answer += value
        }
        
        return answer
    }
}