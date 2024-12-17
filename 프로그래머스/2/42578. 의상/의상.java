import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for (String[] c: clothes) {
            map.put(c[1], map.getOrDefault(c[1], 0) + 1);
        }
        
        for (Map.Entry<String, Integer> data: map.entrySet()) {
            answer *= (data.getValue()+1);
        }
        
        return answer-1;
    }
}