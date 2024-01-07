class Solution {
    fun solution(num_list: IntArray): Int {
        var even: String = ""
    var odd: String = ""

    num_list.forEach { n -> if (n % 2 == 0) even += n.toString() else odd += n.toString() }
    
    return even.toInt() + odd.toInt()
    }
}