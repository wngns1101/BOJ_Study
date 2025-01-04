import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for (int move: moves) {
            for (int i=0; i<board.length; i++) {
                int index = move-1;
                if (board[i][index] != 0) {
                    int temp = board[i][index];
                    board[i][index] = 0;
                    
                    if (!stack.isEmpty() && stack.peek() == temp) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(temp);
                    }
            
                    break;
                }
            }
        }
        
        System.out.println(stack);
        
        return answer;
    }
}