import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Queue<String> queue = new LinkedList<>();
        for (String splitS: s.split("")) {
            queue.offer(splitS);
        }
        
        Queue<String> locationQueue;
        
        for (int i=0; i<queue.size(); i++) {
            Stack<String> stack = new Stack(); 
            locationQueue = new LinkedList<>(queue);
            Boolean isValid = true;
            int size = locationQueue.size();
            
            for (int k=0; k<i; k++) {
                String popQueue = locationQueue.poll();
                locationQueue.offer(popQueue);
            }
            
            for (int j=0; j<size; j++){
                String popQueue = locationQueue.poll();
                
                if(popQueue.equals("{") || popQueue.equals("(") || popQueue.equals("[")) {
                    stack.push(popQueue);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    } else {
                        String popStack = stack.pop();
                        
                        if (popQueue.equals("]") && !popStack.equals("[")) {
                            isValid = false;
                            break;
                        } else if (popQueue.equals("}") && !popStack.equals("{")) {
                            isValid = false;
                            break;
                        } else if (popQueue.equals(")") && !popStack.equals("(")) {
                            isValid = false;
                            break;
                        }
                    }
                }
            }
            if (isValid && stack.isEmpty()) {
                answer++;    
            }
        }
        
        return answer;
    }
}