import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;

        List<String> bonus = Arrays.asList("S", "D", "T");
        List<String> option = Arrays.asList("*", "#");

        List<Integer> scores = new ArrayList<>();
        int idx = -1;
        
        for (int i = 0; i < dartResult.length(); i++) {
            char c = dartResult.charAt(i);

            if (Character.isDigit(c)) {
                int value;
                
                if (c == '1' && dartResult.charAt(i + 1) == '0') {
                    value = 10;
                    i++;
                } else {
                    value = c - '0';
                }
                scores.add(value);
                idx++;
            }
            else if (bonus.contains(String.valueOf(c))) {
                int value = scores.get(idx);
                if (c == 'S') {
                    scores.set(idx, (int) Math.pow(value, 1));
                } else if (c == 'D') {
                    scores.set(idx, (int) Math.pow(value, 2));
                } else if (c == 'T') {
                    scores.set(idx, (int) Math.pow(value, 3));
                }
            }
            else if (option.contains(String.valueOf(c))) {
                if (c == '*') {
                    scores.set(idx, scores.get(idx) * 2);
                    if (idx > 0) {
                        scores.set(idx - 1, scores.get(idx - 1) * 2);
                    }
                } else if (c == '#') {
                    scores.set(idx, scores.get(idx) * -1);
                }
            }
        }

        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}
