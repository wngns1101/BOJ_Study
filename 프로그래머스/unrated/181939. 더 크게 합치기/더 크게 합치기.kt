class Solution {
    fun solution(a: Int, b: Int): Int {
    var answer: Int = 0
    val strA: String = a.toString()
    val strB: String  = b.toString()
    val strAToInt: Int = (strA+strB).toInt()
    val strBToInt: Int = (strB+strA).toInt()
    if(strAToInt >= strBToInt){
        answer = strAToInt
    }else{
        answer = strBToInt
    }
    return answer
    }
}