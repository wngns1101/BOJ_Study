class Solution {
    public int solution(int n) {
        int countOnes = Integer.bitCount(n);
        
        while (true) {
            n++;
            if (Integer.bitCount(n) == countOnes) {
                return n;
            }
        }
    }
}