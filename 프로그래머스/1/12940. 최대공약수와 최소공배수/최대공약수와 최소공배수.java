class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {};
        
        int big = Math.max(n, m);
        int small = Math.min(n, m);
        
        while (small != 0) {
            int left = big % small;
            big = small;
            small = left;
        }
        
        return new int[]{big, n * m / big};
    }
}