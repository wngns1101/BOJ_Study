class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        return (num_list.slice(n until num_list.size) + num_list.slice(0 until n)).toIntArray()
    }
}