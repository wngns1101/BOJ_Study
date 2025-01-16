class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        
        int timeCount = 0;
        for (int i=1; i<=attacks[attacks.length-1][0]; i++) {
            int attack = 0;
            for (int j=0; j<attacks.length; j++) {
                if (i == attacks[j][0]) {
                    attack = attacks[j][1];
                }
            }
            
            if (attack != 0) {
                answer -= attack;
                timeCount = 0;
                if (answer <= 0) {
                    answer = -1;
                    break;
                } else {
                    continue;    
                }
            } else {
                timeCount++;
                answer += bandage[1];
                if (timeCount == bandage[0]) {
                    timeCount = 0;
                    answer += bandage[2];
                }
                if (answer > health) {
                    answer = health;
                }
            }
        }
        
        return answer;
    }
}