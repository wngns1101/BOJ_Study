class Solution {
    fun solution(x1: Boolean, x2: Boolean, x3: Boolean, x4: Boolean): Boolean {
    var answer: Boolean = true
    if ((x1 || x2 ) && (x3 || x4)) answer = true else answer = false
    return answer
    }
}