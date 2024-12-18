import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        char[] sArr = s.toCharArray();
        
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        
         for (int i = 0; i < sArr.length; i++) {
            char current = sArr[i];

            int steps = 0;
            while (steps < index) {
                current++;
                if (current > 'z') {
                    current = 'a';
                }
                if (!skipSet.contains(current)) {
                    steps++;
                }
            }

            answer += current;
        }
        
        return answer;
    }
}