import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        String ateFood = "";
        
        for (int i=1; i<food.length; i++) {
            for (int j=0; j<food[i] / 2; j++) {
                ateFood += i;
            }
        }
        
        StringBuffer sb = new StringBuffer(ateFood);
        
        return ateFood + "0" + sb.reverse().toString();
    }
}