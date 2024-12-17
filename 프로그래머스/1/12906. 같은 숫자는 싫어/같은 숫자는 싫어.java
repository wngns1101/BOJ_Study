import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int a: arr) {
            queue.add(a);
        }
        
        list.add(queue.peek());
        
        for (int num: queue) {
            if (list.get(list.size()-1) == num) {
                continue;
            }else{
                list.add(num);
            }
        }
        
        answer = new int[list.size()];
        
        for (int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}