class Solution {
    /*
        DP(점화식)
    */
    
    public long solution(int n) {
        long answer = 0;
        
        int[] nums = new int[2001];
        nums[0] = 1;
        nums[1] = 2;
        
        for (int i=2; i<=n; i++) {
            nums[i] = (nums[i-1] + nums[i-2]) % 1234567;
        }
        
        return nums[n-1];
    }
}