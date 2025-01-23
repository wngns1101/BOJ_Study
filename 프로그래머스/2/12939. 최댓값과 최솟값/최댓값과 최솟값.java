import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] splitS = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        answer += Arrays.stream(splitS).min().orElseThrow();
        answer += " ";
        answer += Arrays.stream(splitS).max().orElseThrow();
            
        return answer;
    }
}