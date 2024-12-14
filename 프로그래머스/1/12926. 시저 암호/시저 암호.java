class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                answer += " ";
                continue;
            }
            if (c >= 'A' && c <= 'Z') {
                int pushC = c + n;
                if (pushC > 'Z') {
                    pushC -= 26;
                }
                answer += (char) pushC;
            } else if (c >= 'a' && c <= 'z') {
                int pushC = c + n;
                if (pushC > 'z') {
                    pushC -= 26;
                }
                answer += (char) pushC;
            }
        }
        
        return answer;
    }
}