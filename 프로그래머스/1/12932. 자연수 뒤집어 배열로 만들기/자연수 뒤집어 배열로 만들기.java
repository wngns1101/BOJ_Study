import java.util.*;

class Solution {
    public int[] solution(long n) {
        int numLength = (int)Math.log10(n)+1;
        
        int[] answer = new int[numLength];
        
        for (int i=0; i<answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        
        return answer;
    }
}