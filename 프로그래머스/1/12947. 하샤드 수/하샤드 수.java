import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String[] digits = String.valueOf(x).split("");
        
        int digitSum = Arrays.stream(digits).mapToInt(Integer::parseInt).sum();
        
        if (x % digitSum == 0) {
            return true;
        } else {
            return false;
        }
    }
}