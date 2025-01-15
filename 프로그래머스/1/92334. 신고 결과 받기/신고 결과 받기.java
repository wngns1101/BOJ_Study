import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> map = new LinkedHashMap<>();
        Map<String, List<String>> countMap = new HashMap<>();
        Set<String> set = new HashSet(List.of(report));
        
        for (String list: id_list) {
            map.put(list, 0);
            countMap.put(list, new ArrayList());
        }
        
        for (String s: set) {
            String[] str = s.split(" ");
            
            countMap.get(str[1]).add(str[0]);
        }
        
        for (Map.Entry<String, List<String>> cM: countMap.entrySet()) {
            if (cM.getValue().size() >= k) {
                for (String s: cM.getValue()) {
                    map.put(s, map.get(s)+1);
                }
            }
        }
        
        int index=0;
        for (Map.Entry<String, Integer> m: map.entrySet()) {
            answer[index] = m.getValue();
            index++;
        }
        
        return answer;
    }
}