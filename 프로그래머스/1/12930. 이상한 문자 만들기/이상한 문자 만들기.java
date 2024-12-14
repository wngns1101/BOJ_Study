import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] words = s.split(" ", -1);
        List<String> newS = new ArrayList<>();
            
        for (String word: words) {
            String[] characters = word.split("");
            String newWords = "";
            for (int i=0; i<characters.length; i++) {
                if (i % 2 ==0) {
                    newWords += characters[i].toUpperCase();
                } else {
                    newWords += characters[i].toLowerCase();
                }
            }
            newS.add(newWords);
        }
        
        return String.join(" ", newS);
    }
}