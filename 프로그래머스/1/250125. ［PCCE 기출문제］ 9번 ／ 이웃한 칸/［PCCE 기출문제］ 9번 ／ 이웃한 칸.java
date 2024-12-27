class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        int[][] dots = {{0, -1},{0, 1},{-1, 0},{1, 0}};
        String selectedCell = board[h][w];
        
        for (int[] dot: dots) {
            int x = h + dot[0];
            int y = w + dot[1];
            
            if (x < 0 || x > board.length-1 || y < 0 || y > board[0].length-1) {
                continue;
            }
            
            if (board[x][y].equals(selectedCell)) {
                answer += 1;
            }
        }
        
        return answer;
    }
}