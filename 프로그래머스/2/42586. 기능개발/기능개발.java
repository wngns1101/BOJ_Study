import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < progresses.length; i++) {
            int remainingDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            queue.add(remainingDays);
        }
        
        while (!queue.isEmpty()) {
            int firstTask = queue.peek();
            int count = 0;
            
            while (!queue.isEmpty() && queue.peek() <= firstTask) {
                queue.remove();
                count++;
            }
            
            answer.add(count);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}