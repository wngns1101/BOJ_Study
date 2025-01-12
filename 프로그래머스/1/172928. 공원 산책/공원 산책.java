class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[][] map = new int[park.length][park[0].length()];
        int[] currentPosition = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            String[] splitPark = park[i].split("");
            for (int j = 0; j < splitPark.length; j++) {
                if (splitPark[j].equals("S")) {
                    map[i][j] = 2;
                    currentPosition[0] = i;
                    currentPosition[1] = j;
                } else if (splitPark[j].equals("O")) {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 0;
                }
            }
        }
        
        for (int i = 0; i < routes.length; i++) {
            String[] route = routes[i].split(" ");
            String direction = route[0];
            int distance = Integer.parseInt(route[1]);
            
            int tempRow = currentPosition[0];
            int tempCol = currentPosition[1];
            
            boolean isValidMove = true;
            for (int j = 1; j <= distance; j++) {
                if (direction.equals("E")) {
                    tempCol++;
                } else if (direction.equals("S")) {
                    tempRow++;
                } else if (direction.equals("W")) {
                    tempCol--;
                } else if (direction.equals("N")) {
                    tempRow--;
                }

                if (tempRow < 0 || tempRow >= park.length || tempCol < 0 || tempCol >= park[0].length() || map[tempRow][tempCol] == 0) {
                    isValidMove = false;
                    break;
                }
            }
            
            if (isValidMove) {
                currentPosition[0] = tempRow;
                currentPosition[1] = tempCol;
            }
        }
        
        return new int[] {currentPosition[0], currentPosition[1]};
    }
}
