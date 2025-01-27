import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<String> stack = new Stack<>();
        
        String[] splitS = s.split("");
        
        for (String c: splitS) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                if (c.equals(stack.peek())) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }
        
        if (stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
        
    }
}