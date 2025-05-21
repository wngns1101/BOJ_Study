import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Queue<String> queue = new LinkedList<>();
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        for (String city: cities) {
            String upperCity = city.toUpperCase();
            if (queue.contains(upperCity)) {
                queue.remove(upperCity);
                answer += 1;
                queue.offer(upperCity);
            } else {
                if (queue.size() < cacheSize) {
                    queue.offer(upperCity);
                    answer += 5;
                } else {
                    queue.poll();
                    answer += 5;
                    queue.offer(upperCity);
                }
            }
        }
        
        return answer;
    }
}