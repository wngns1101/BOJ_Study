class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int i=3; i<=brown+yellow; i++) {
            int height = i;
            int width = (brown+yellow) / i;
            
            if (width < 3) {
                continue;
            }
            
            if (width >= height) {
                if ((height-2) * (width-2) == yellow) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                } 
            }
        }
        
        return answer;
    }
}