import java.util.*;

class Solution {
    /*
        sudo
        리스트 선언
        
        words의 길이만큼 반복
            해당 인덱스의 워드가 리스트에 존재할 때
                return [i를 3으로 나눈 몫, i를 3으로 나눈 나머지]
            else:
                리스트에 추가
                
        return [0, 0]
    */
    
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();

        for (int i=0; i<words.length; i++) {       
            if (!list.isEmpty()) {
                String preWord = list.get(list.size()-1);
                String currentWord = words[i];
                
                if (preWord.charAt(preWord.length()-1) != currentWord.charAt(0)) {
                    return new int[]{(i%n)+1, (i/n)+1};
                }
                
                if (list.contains(currentWord)) {
                    return new int[]{(i%n)+1, (i/n)+1};
                }
            }
            list.add(words[i]);
        }
        
        return new int[]{0, 0};
    }
}