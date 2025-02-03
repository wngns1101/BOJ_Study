import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i=1; i<arr.length; i++) {
            int r = gcd(answer, arr[i]);
            answer = (answer * arr[i]) / r;
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        int maxNum = Math.max(a, b);
        int minNum = Math.min(a, b);
        
        while(minNum != 0) {
            int r = maxNum % minNum;
            maxNum = minNum;
            minNum = r;
        }
        
        return maxNum;
    }
}