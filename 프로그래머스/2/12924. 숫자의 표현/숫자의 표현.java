class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            int sum = 0;
            for (int j=i; j<=n; j++) {
                sum += j;
                if (sum >= n) {
                    if (sum == n) {
                        answer += 1;
                    }
                    break;
                }
            }
        }
        
        return answer;
    }
}