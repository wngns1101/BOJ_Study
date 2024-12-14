class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        String addS = "";
        
        for (int i=0; i<s.length(); i++) {
            int find = addS.lastIndexOf(s.charAt(i));
            addS += s.charAt(i);
            if (find == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - find;
            }
        }
        
        return answer;
    }
}