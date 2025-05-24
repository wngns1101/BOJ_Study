import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> splitStr1 = new ArrayList<>();
        List<String> splitStr2 = new ArrayList<>();

        List<String> intersect = new ArrayList<>();
        List<String> union = new ArrayList<>();
        
        String str1ToLowerCase = str1.toLowerCase();
        String str2ToLowerCase = str2.toLowerCase();
        
        for (int i=0; i<str1ToLowerCase.length()-1; i++) {
            String s = str1ToLowerCase.substring(i, i+2).replaceAll("[^a-z]", "");
            if (2 > s.length()) {
                continue;
            }
            
            splitStr1.add(s);
        }
        
        for (int i=0; i<str2ToLowerCase.length()-1; i++) {
            String s = str2ToLowerCase.substring(i, i+2).replaceAll("[^a-z]", "");
            if (2 > s.length()) {
                continue;
            }
            
            splitStr2.add(s);
        }
        
        if (splitStr1.isEmpty() && splitStr2.isEmpty()) {
            return 65536;
        }
        
        for (String s: splitStr1) {
            if (splitStr2.remove(s)) {
                intersect.add(s);
            }
            union.add(s);
        }
        
        union.addAll(splitStr2);
        
        double jakad = (double)intersect.size() / (double)union.size();
        
        return (int) (jakad * 65536);
    }
}