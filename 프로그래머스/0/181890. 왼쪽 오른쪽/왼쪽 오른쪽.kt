class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        val l = str_list.indexOfFirst{it == "l"}
        val r = str_list.indexOfFirst{it == "r"}
        
        return when {
            l == -1 && r == -1 -> emptyArray()
            r == -1 || (l != -1 && l < r) -> str_list.slice(0 until l).toTypedArray()
            l == -1 || (r != -1 && r < l) -> str_list.slice(r + 1 until str_list.size).toTypedArray()
            else -> emptyArray()
        }
    }
}