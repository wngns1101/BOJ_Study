import java.util.stream.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i=left; i<=right; i++) {
            final int num = i;
            int filterCount = (int) IntStream.rangeClosed(1, num)
                .filter(it -> num % it == 0)
                .count();
            if (filterCount % 2 == 0) answer += num; else answer -= num;
        }
        
        return answer;
    }
}