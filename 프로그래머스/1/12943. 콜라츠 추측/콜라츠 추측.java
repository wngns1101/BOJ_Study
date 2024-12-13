class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while (num != 1 && answer < 500) {
            if (num % 2 == 0) {
                num /= 2;
                answer++;
                continue;
            }
            if(num % 2 == 1) {
                num = (num * 3) + 1;
                answer++;
                continue;
            }
        }
        
        return (num == 1) ? answer : -1;
    }
}
