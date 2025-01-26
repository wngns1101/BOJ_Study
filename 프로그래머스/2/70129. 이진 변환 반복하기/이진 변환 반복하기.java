class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while (true) {
            if (s.equals("1")) {
                break;
            }
            
            String[] splitS = s.split("");
            
            int numLength = 0;
            int removeZeroCount = 0;
            
            for (String c: splitS) {
                if (c.equals("1")) {
                    numLength++;
                } else {
                    removeZeroCount++;
                }
            }
            
            s = Integer.toBinaryString(numLength);
            
            answer[0] += 1;
            answer[1] += removeZeroCount;
        }
        
        
        return answer;
    }
}