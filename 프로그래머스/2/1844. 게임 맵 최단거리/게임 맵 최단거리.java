import java.util.*;

class Solution {
    int[] dX = {1, 0, -1, 0};
    int[] dY = {0, 1, 0, -1};
    
    public int solution(int[][] maps) {
        int answer = 0;
        
        int[][] visited = new int[maps.length][maps[0].length];
        
        bfs(maps, visited);
        
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0){
            answer = -1;
        }
        
        return answer;
    }
    
    private void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        
        visited[x][y] = 1;
        
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int cX = current[0];
            int cY = current[1];
            
            for (int i=0; i<4; i++) {
                int nX = cX + dX[i];
                int nY = cY + dY[i];
                
                if (nX < 0 || nY < 0 || nX > maps.length-1 || nY > maps[0].length-1) {
                    continue;
                }
                
                if (visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }
        }
        
    }
}