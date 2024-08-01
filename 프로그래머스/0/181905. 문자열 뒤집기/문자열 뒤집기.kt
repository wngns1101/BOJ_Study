class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        var answer: String = ""
        val extract = my_string.substring(s, e+1)
        return my_string.replace(extract, extract.reversed())
    }
}