class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;

        for (int i=1; i<=count; i++){
            answer += price * i;
        }
        
        System.out.println(answer);
        System.out.println(money);
        
        if (money >= answer) {
            answer = 0;
        } else {
            answer = answer - money;
        }
        
        return answer;
    }
}