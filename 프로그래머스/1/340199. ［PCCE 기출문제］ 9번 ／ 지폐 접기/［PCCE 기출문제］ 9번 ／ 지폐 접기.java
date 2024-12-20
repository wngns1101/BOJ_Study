import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int walletMin = Math.min(wallet[0], wallet[1]); // 15
        int walletMax = Math.max(wallet[0], wallet[1]); // 30
        int billMin = Math.min(bill[0], bill[1]); // 17
        int billMax = Math.max(bill[0], bill[1]); // 26
        
        while (billMin > walletMin || billMax > walletMax) {
            if (bill[0] > bill[1]) {
                bill[0] /= 2;
            } else {
                bill[1] /= 2;
            }
            answer += 1;
            
            billMin = Math.min(bill[0], bill[1]);
            billMax = Math.max(bill[0], bill[1]);
        }
        
        return answer;
    }
}