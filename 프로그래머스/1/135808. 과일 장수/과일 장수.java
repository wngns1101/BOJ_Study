import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Integer[] arr3 = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr3, Collections.reverseOrder());
        
        for (int i=0; i<score.length; i+=m){
            if (i+m > score.length) {
                continue;
            }
            answer += arr3[i+m-1] * m * 1;
        }
        
        return answer;
    }
}