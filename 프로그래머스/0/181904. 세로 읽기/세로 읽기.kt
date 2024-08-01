class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        return my_string.slice(c-1..my_string.length-1 step m)
    }
}