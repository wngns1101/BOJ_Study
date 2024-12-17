import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
//         List<String> names = new ArrayList<String>(Arrays.asList(participant));
        
//         for (String c: completion) {
//             names.remove(c);
//         }
        
//         return names.get(0);
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (String p: participant) {
            map.put(p, map.getOrDefault(p, 0)+1);
        }
        
        for (String c: completion) {
            map.put(c, map.getOrDefault(c, 0)-1);
        }
        
        for (String key: map.keySet()) {
            if (map.get(key)== 1) {
                return key;
            } 
        }
        return "";
    }
}