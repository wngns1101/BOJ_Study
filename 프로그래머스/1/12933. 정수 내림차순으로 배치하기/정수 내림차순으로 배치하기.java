import java.util.*;
import java.io.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        Integer[] nums = Arrays.stream(Long.toString(n).split("")).map(Integer::parseInt).toArray(Integer[]::new);
        Arrays.sort(nums, Collections.reverseOrder());
        
        String str = "";    
            
        for(Integer num: nums) {
            str += Integer.toString(num);
        }
            
        answer = Long.parseLong(str);
        
        return answer;
    }
}