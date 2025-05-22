import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<Integer> answer = new ArrayList<>();
        String[] convertS = s.substring(2, s.length()-2).replace("},{", "-").split("-");
        
        Arrays.sort(convertS, Comparator.comparingInt(String::length));
        
        for (String cS: convertS) {
            String[] splitC = cS.split(",");
            
            for (String sc: splitC) {
                int scParseToInt = Integer.parseInt(sc);
                if (!answer.contains(scParseToInt)) {
                    answer.add(scParseToInt);
                }
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}