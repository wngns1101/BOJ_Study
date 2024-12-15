import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        int[] sumArr = new int[arr1.length];
        
        int[][] arr1Map = new int[arr1.length][arr2.length];
        
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            
            String str = Integer.toBinaryString(combined);
            
            while (str.length() < n) {
                str = "0" + str;
            }
            
            
            str = str.replaceAll("1", "#");
            str = str.replaceAll("0", " ");

            answer[i] = str;
        }
        
        return answer;
    }
}