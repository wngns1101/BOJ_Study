class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        for (query in queries) {
            val start = query[0]
            val end = query[1]
            val reversedSubstring = answer.substring(start, end + 1).reversed()
            answer = answer.substring(0, start) + reversedSubstring + answer.substring(end + 1)
        }
        return answer
    }
}