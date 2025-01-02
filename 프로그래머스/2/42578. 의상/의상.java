import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> mapClothes = new HashMap<>();
        
        for (String[] cloth: clothes) {
            mapClothes.put(cloth[1], mapClothes.getOrDefault(cloth[1], 0)+1);
        }
        
        int result = 1;
        for (Map.Entry<String, Integer> entry : mapClothes.entrySet()) {
            result *= (entry.getValue()+1);
        }
        
        return result - 1;
    }
}