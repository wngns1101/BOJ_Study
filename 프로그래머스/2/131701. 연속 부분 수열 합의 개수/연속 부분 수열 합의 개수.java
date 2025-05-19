import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        int n = elements.length;

        int[] doubled = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            doubled[i] = elements[i % n];
        }

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                
                for (int k = 0; k < len; k++) {
                    sum += doubled[start + k];
                }
                set.add(sum);
            }
        }

        return set.size();
    }
}