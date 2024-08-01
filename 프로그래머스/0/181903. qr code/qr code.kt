class Solution {
    fun solution(q: Int, r: Int, code: String): String {
        var answer = ""
        code.mapIndexed{ index, _ -> if (index % q == r) answer += code[index] }
        return answer
    }
}