class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[][] keyPad = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{-1, 0, -1}};
        
        int[] leftLocation = {3, 0};
        int[] rightLocation = {3, 2};
        
        for (int number: numbers) {
            if (number == 1 || number == 4 || number == 7) {
                for (int i=0; i<keyPad.length; i++) {
                    for (int j=0; j<keyPad[0].length; j++) {
                        if (keyPad[i][j] == number) {
                            leftLocation[0] = i;
                            leftLocation[1] = j;
                            answer += "L";
                            continue;
                        }
                    }
                }
            } else if (number == 3 || number == 6 || number == 9) {
                for (int i=0; i<keyPad.length; i++) {
                    for (int j=0; j<keyPad[0].length; j++) {
                        if (keyPad[i][j] == number) {
                            rightLocation[0] = i;
                            rightLocation[1] = j;
                            answer += "R";
                            continue;
                        }
                    }
                }
            } else {
                int[] targetLocation = new int[2];
                for (int i=0; i<keyPad.length; i++) {
                    for (int j=0; j<keyPad[0].length; j++) {
                        if (keyPad[i][j] == number) {
                            targetLocation[0] = i;
                            targetLocation[1] = j;
                        }
                    }
                }
                
                int leftDistance = Math.abs(leftLocation[0] - targetLocation[0]) + Math.abs(leftLocation[1] - targetLocation[1]);
                int rightDistance = Math.abs(rightLocation[0] - targetLocation[0]) + Math.abs(rightLocation[1] - targetLocation[1]);
                
                if (leftDistance < rightDistance || 
                    (leftDistance == rightDistance && hand.equals("left"))) {
                    leftLocation[0] = targetLocation[0];
                    leftLocation[1] = targetLocation[1];
                    answer += "L";
                } else {
                    rightLocation[0] = targetLocation[0];
                    rightLocation[1] = targetLocation[1];
                    answer += "R";
                }
            }
        }
        
        
        return answer;
    }
}