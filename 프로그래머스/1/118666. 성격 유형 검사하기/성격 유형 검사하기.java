import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        Map<String, Integer> map = new HashMap<>(Map.of(
                "R", 0,
                "T", 0,
                "C", 0,
                "F", 0,
                "J", 0,
                "M", 0,
                "A", 0,
                "N", 0
        ));
        
        for (int i=0; i<survey.length; i++) {
            String leftWord = String.valueOf(survey[i].charAt(0));
            String rightWord = String.valueOf(survey[i].charAt(1));
            
            int score = Math.abs(choices[i] - 4);

            
            if (choices[i] > 4) {
                map.put(rightWord, map.get(rightWord)+score);
            } else if (choices[i] < 4) {
                map.put(leftWord, map.get(leftWord)+score);
            }
        }
        
        if (map.get("R") >= map.get("T")) {
            answer += "R";
        } else {
            answer += "T";
        }
        
        if (map.get("C") >= map.get("F")) {
            answer += "C";
        } else {
            answer += "F";
        }
        
        if (map.get("J") >= map.get("M")) {
            answer += "J";
        } else {
            answer += "M";
        }
        
        if (map.get("A") >= map.get("N")) {
            answer += "A";
        } else {
            answer += "N";
        }
        
        return answer;
    }
}