import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] measure = new int[number+1];
        
        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j += i) {
                measure[j]++;
            }
        }
        
        for (int i=0; i<measure.length; i++) {
            if (measure[i] >limit) {
                measure[i] = power;
            }
            answer += measure[i];
        }
        
        return answer;
    }
}