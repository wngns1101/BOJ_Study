import java.util.*;


class Solution {
    public int[] solution(int N, int[] stages) {
        int[] counts = new int[N+2];
        
        Map<Integer, Float> map = new HashMap<>();
        
        for (int stage : stages) {
            if (stage <= N) {
                counts[stage]++;
            }
        }
        
        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            if (totalPlayers > 0) {
                map.put(i, (float) counts[i] / totalPlayers);
                totalPlayers -= counts[i];
            } else {
                map.put(i, 0f);
            }
        }
        
        List<Map.Entry<Integer, Float>> entryList = new ArrayList<>(map.entrySet());
        
        entryList.sort((e1, e2) -> {
            int compare = e2.getValue().compareTo(e1.getValue());
            if (compare == 0) {
                return e1.getKey() - e2.getKey();
            }
            return compare;
        });
        
        int[] result = new int[N];
        for (int i=0; i<entryList.size(); i++) {
            result[i] = entryList.get(i).getKey();
        }
        
        return result;
    }
}