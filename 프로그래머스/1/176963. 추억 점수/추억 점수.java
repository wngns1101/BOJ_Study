import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        List<String> nameList = Arrays.asList(name);

        
        int index = 0;
        for (String[] p: photo) {
            for (int i=0; i<p.length; i++) {
                int pIndex = nameList.indexOf(p[i]);
                if (pIndex == -1) {
                    continue;
                }
                answer[index] += yearning[pIndex];
            }
            index++;
        }
        
        return answer;
    }
}