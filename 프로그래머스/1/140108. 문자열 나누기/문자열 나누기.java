import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Queue<Character> queue = new LinkedList<>();
        
        int standardCount = 0;
        int otherCount = 0;
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            
            if (queue.isEmpty()) {
                queue.offer(c);
                standardCount++;
                continue;
            }
            
            if (c == queue.peek()) {
                standardCount++;
            } else {
                otherCount++;
            }
            
            if (standardCount == otherCount) {
                queue.clear();
                standardCount = 0;
                otherCount = 0;
                answer++;
            }
        }
        
        if (!queue.isEmpty()) {
            answer++;
        }
        
        return answer;
    }
}