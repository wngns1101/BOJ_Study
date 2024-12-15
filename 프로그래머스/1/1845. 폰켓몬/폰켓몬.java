import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> setNums = new HashSet<>();
        for (int num : nums) {
            setNums.add(num);
        }
        
        if (setNums.size() == nums.length / 2) {
            answer = nums.length / 2;
        } else if (setNums.size() < nums.length / 2){
            answer = setNums.size();
        } else {
            answer = nums.length / 2;
        }
        
        return answer;
    }
}