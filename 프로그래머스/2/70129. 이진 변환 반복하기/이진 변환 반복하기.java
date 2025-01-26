class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int removeCount = 0;
        int removeZeroCount = 0;
        
        while (true) {
            if (s.equals("1")) {
                break;
            }
            
            String[] splitS = s.split("");
            int numLength = 0;
            
            for (String c: splitS) {
                if (c.equals("1")) {
                    numLength++;
                } else {
                    removeZeroCount++;
                }
            }
            
            s = Integer.toBinaryString(numLength);
            numLength = 0;
            removeCount++;
        }
        
        answer[0] = removeCount;
        answer[1] = removeZeroCount;
        
        return answer;
    }
}