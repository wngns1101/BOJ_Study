import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();
        
        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }
        
        int[] todayDate = Arrays.stream(today.split("\\.")).mapToInt(Integer::parseInt).toArray();
        
        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            int[] privacyDate = Arrays.stream(parts[0].split("\\.")).mapToInt(Integer::parseInt).toArray();
            int termMonths = termMap.get(parts[1]);
            
            privacyDate[1] += termMonths;
            while (privacyDate[1] > 12) {
                privacyDate[0]++;
                privacyDate[1] -= 12;
            }
            
            if (isExpired(todayDate, privacyDate)) {
                answer.add(i + 1);
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private boolean isExpired(int[] today, int[] targetDate) {
        if (today[0] > targetDate[0]) return true;
        if (today[0] < targetDate[0]) return false;

        if (today[1] > targetDate[1]) return true;
        if (today[1] < targetDate[1]) return false;

        return today[2] >= targetDate[2];
    }
}
