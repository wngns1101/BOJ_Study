import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];  // 결과 배열 (매일 발표된 최하위 점수 기록)
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        int index = 0;
        
        for (int s: score) {
            queue.offer(s);
            
            if (queue.size() > k) {
                queue.poll();
            }
            
            answer[index] = queue.peek();
            index++;
        }
        

        return answer;
    }
}