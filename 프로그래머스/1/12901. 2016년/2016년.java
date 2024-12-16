import java.time.*;
import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] lastDay = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int[] copyLastDay = Arrays.copyOfRange(lastDay, 0, a);
        
        int totalDays = Arrays.stream(copyLastDay).sum();
        totalDays += b;
        
        int findWeek = (totalDays+4) % 7;
        
        return days[findWeek];
    }
}