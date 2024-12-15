import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        
        Queue<String> card1Queue = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> card2Queue = new LinkedList<>(Arrays.asList(cards2));

        for (int i=0; i<goal.length; i++){
            if (!card1Queue.isEmpty() && card1Queue.peek().equals(goal[i])) {
                card1Queue.poll();
            } else if (!card2Queue.isEmpty() && card2Queue.peek().equals(goal[i])) {
                card2Queue.poll();
            } else {
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}