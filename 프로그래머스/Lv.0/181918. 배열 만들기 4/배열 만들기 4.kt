class Solution {
    fun solution(arr: IntArray): MutableList<Int> {
var stk: MutableList<Int> = mutableListOf()
    var i = 0
    while (arr.size > i) {
        if (stk.isEmpty()) {
            stk.add(arr[i])
            i += 1
        } else if (stk.isNotEmpty() && stk.last() < arr[i]) {
            stk.add(arr[i])
            i += 1
        } else if (stk.isNotEmpty() && stk.last() >= arr[i]) {
            stk.removeAt(stk.size - 1) // Use size - 1 to get the index of the last element
        }
    }
    return stk
    }
}