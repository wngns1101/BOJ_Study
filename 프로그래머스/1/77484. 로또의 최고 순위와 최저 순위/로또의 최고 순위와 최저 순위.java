import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        List<Integer> winNumsList = new ArrayList<>();
        for (int num : win_nums) {
           winNumsList.add(num);
        }
        
        Map<Integer, Integer> rank = new HashMap<>();
        for (int i=1; i<=6; i++) {
            if (i == 6) {
                rank.put(0, i);
            } else {
                rank.put(7-i, i);    
            }
        }
        
        rank.put(1, 6);
        
        int zeroCount = 0;
        int correctCount = 0;
        
        for (int i=0; i<lottos.length; i++) {
            int lotto = lottos[i];
            
            if (lotto == 0) {
                zeroCount++;
                continue;
            }
            
            if (winNumsList.contains(lotto)) {
                correctCount++;
                continue;
            }
        }
    
        answer[0] = rank.get(zeroCount + correctCount);
        answer[1] = rank.get(correctCount);
        
        return answer;
    }
}