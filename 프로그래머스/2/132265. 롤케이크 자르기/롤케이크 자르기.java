import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> leftTopping = new HashSet<>();
        Map<Integer, Integer> rightTopping = new HashMap<>();
        for (int i=0; i<topping.length; i++) {
            rightTopping.put(topping[i], rightTopping.getOrDefault(topping[i], 0)+1);
        }
        
        
        for (int i=0; i<topping.length; i++) {
            leftTopping.add(topping[i]);
            
            rightTopping.put(topping[i], rightTopping.get(topping[i])-1);
            
            if (rightTopping.get(topping[i]) == 0) {
                rightTopping.remove(topping[i]);
            }
            
            if (leftTopping.size() == rightTopping.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}