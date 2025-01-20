import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        // 큰 돗자리부터 검사하기 위해 내림차순 정렬
        Arrays.sort(mats);
        for (int idx = mats.length - 1; idx >= 0; idx--) {
            int mat = mats[idx];

            // 공원에서 현재 크기의 돗자리를 깔 수 있는지 확인
            for (int i = 0; i <= park.length - mat; i++) {
                for (int j = 0; j <= park[0].length - mat; j++) {
                    if (canPlaceMat(park, i, j, mat)) {
                        return mat; // 가장 큰 돗자리 반환
                    }
                }
            }
        }

        return -1; // 깔 수 있는 돗자리가 없으면 -1 반환
    }

    // 특정 위치에 돗자리를 깔 수 있는지 확인하는 메서드
    private boolean canPlaceMat(String[][] park, int startX, int startY, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (!park[startX + i][startY + j].equals("-1")) {
                    return false; // 사람이 있는 자리면 돗자리를 깔 수 없음
                }
            }
        }
        return true; // 모든 자리가 비어 있으면 돗자리를 깔 수 있음
    }
}
