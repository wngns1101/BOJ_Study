import java.util.*;

class Solution {
    /*
        서로 다른 종류가 최소가 되도록
        서로 다른 종류의 최솟값 리턴
        
        sudo 코드
        
        map 자료구조 생성
        
        tangerine을 반복문 돌려서 map에 넣기
        
        map 정렬 내림차순 정렬
        
        k를 0이 될 때까지 뺀 수 카운트
    */
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int t: tangerine) {
            map.put(t, map.getOrDefault(t, 0)+1);    
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());
        
        for (Map.Entry<Integer,Integer> l: list) {
            k -= l.getValue();
            answer++; 
            
            if (k <= 0) {
                break;
            }   
        }
        
        return answer;
    }
}