import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        int answer = 0;    
    
        for (int i=0; i<want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        for (int start = 0; start <= discount.length - 10; start++) {
            Map<String, Integer> discountMap = new HashMap<>();

            for (int i = start; i < start + 10; i++) {
                String item = discount[i];
                discountMap.put(item, discountMap.getOrDefault(item, 0) + 1);
            }
            
            boolean match = true;
            
            for (String key: wantMap.keySet()) {
                if (discountMap.getOrDefault(key, 0) < wantMap.get(key)) {
                    match = false;
                    break;
                }                
            }
            
            if (match) answer++;
        }
        
        
        return answer;
    }
}