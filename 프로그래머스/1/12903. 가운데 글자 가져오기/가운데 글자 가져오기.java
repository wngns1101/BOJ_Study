class Solution {
    public String solution(String s) {
        String answer = "";
        String[] c = s.split("");
        if (s.length() % 2 == 0) {
            answer += c[(s.length()/2)-1];
            answer += c[s.length()/2];
        }else{
            answer += c[s.length()/2];
        }
        return answer;
    }
}