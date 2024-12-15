import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int index = 0;
        
        for (int[] command: commands) {
            int[] sliceArray = Arrays.copyOfRange(array, command[0]-1, command[1]);
            Arrays.sort(sliceArray);
            answer[index] = sliceArray[command[2]-1];
            index++;
        }
        
        return answer;
    }
}