class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = arr.copyOf()
        queries.map{
            q -> for(i in q[0]..q[1]){
                if(i % q[2] == 0) answer[i] += 1
            }
        }
        return answer
    }
}

