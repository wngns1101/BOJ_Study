import java.util.*;

class Solution {
    public int solution(String word) {
        int answer = 0;
        List<Character> words = Arrays.asList('A', 'E', 'I', 'O', 'U');
        int[] wordWeight = {781, 156, 31, 6, 1};
        
        for (int i=0; i<word.length(); i++) {
            char ch = word.charAt(i);
            int index = words.indexOf(ch);
            
            answer += index * wordWeight[i] + 1;
        }
        
        return answer;
    }
}