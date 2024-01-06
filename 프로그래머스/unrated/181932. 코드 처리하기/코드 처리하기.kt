class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Int = 0
        for (i in 0..code.length-1){
            if (mode == 0){
                if(code[i] != '1' && i % 2 == 0){
                    answer += code[i]
                }
                if(code[i] == '1'){
                    mode = 1
                }
            }else{
                if(code[i] != '1' && i % 2 != 0){
                    answer += code[i]
                }
                if(code[i] == '1'){
                    mode = 0
                }
            }
        }
        return if (answer.isEmpty()) "EMPTY" else answer
    }
}