class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        val answer = IntArray(queries.size) // 결과를 저장할 배열을 queries의 크기로 초기화
        queries.forEachIndexed { index, query ->
            var temp = -1 // 각 query에 대한 최소값을 저장할 변수
            for (i in query[0]..query[1]) {
                if (arr[i] > query[2]) { // arr[i]가 query[2]보다 큰 경우
                    if (temp == -1 || arr[i] < temp) { // temp가 초기값(-1)이거나 arr[i]가 현재 temp보다 작은 경우
                        temp = arr[i] // temp 값을 arr[i]로 업데이트
                    }
                }
            }
            answer[index] = temp // 현재 query에 대한 결과를 answer 배열에 저장
        }
        return answer
    }
}