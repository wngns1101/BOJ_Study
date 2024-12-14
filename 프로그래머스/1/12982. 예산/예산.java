import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int limit = budget;
            
        Arrays.sort(d);
        
        for (int i=0; i<d.length; i++) {
            int result = 0;
            for(int j=i; j<d.length; j++) {
                if (limit-d[j] < 0) {
                    break;
                }
                limit -= d[j];
                result += 1;
            }
            if (result > answer ){
                answer = result;
            }
        }
        
        return answer;
    }
}