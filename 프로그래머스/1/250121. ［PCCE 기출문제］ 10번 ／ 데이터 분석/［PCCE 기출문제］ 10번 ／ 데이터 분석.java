import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] exts = new String[]{"code", "date", "maximum", "remain"};
        
        int extIndex = 0;
        int sortIndex = 0;
        for (int i=0; i<exts.length; i++) {
            if (exts[i].equals(ext)) {
                extIndex = i;
            }
            if (exts[i].equals(sort_by)) {
                sortIndex = i;
            }
        }
        
        int finalExtIndex = extIndex;
        int finalSortIndex = sortIndex;
        
        int count = 0;
        for (int[] d: data) {
            if (d[finalExtIndex] < val_ext) {
                count++;
            }
        }
        
        int[][] answer = new int[count][];
        
        int index = 0;
        for (int[] d: data) {
            if (d[finalExtIndex] < val_ext) {
                answer[index] = d;
                index++;
            }
        }
        
        Arrays.sort(answer, Comparator.comparingInt(a -> a[finalSortIndex]));
        
        return answer;
    }
}