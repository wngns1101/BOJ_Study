import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;
        
        int x = 0;
        int y = 0;
        
        Set<String> visited = new HashSet<>();
        
        int[][] move = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        
        Map<Character, int[]> dirMap = new HashMap<>();
        dirMap.put('L', move[0]);
        dirMap.put('R', move[1]);
        dirMap.put('U', move[2]);
        dirMap.put('D', move[3]);
        
        for (char c: dirs.toCharArray()) {
            int[] direction = dirMap.get(c);
            
            int dx = x + direction[0];
            int dy = y + direction[1];
            
            if (dx < -5 || dx > 5 || dy < -5 || dy > 5) {
                continue;
            } 
            
            String path = x + "," + y + "," + dx + "," + dy;
            String reversePath = dx + "," + dy + "," + x + "," + y;
            
            if (!visited.contains(path) && !visited.contains(reversePath)) {
                visited.add(path);
                visited.add(reversePath);
                answer++;
            }
            
            x = dx;
            y = dy;
        }
        
        return answer;
    }
}