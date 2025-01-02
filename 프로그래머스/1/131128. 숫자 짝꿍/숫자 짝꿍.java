import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        // List<String> splitX = Arrays.asList(X.split(""));
        // List<String> splitY = new ArrayList<>(Arrays.asList(Y.split("")));
        
        Map<String, Integer> countMapY = new HashMap<>();
        
        for (String y: Y.split("")) {
            countMapY.put(y, countMapY.getOrDefault(y, 0)+1);
        }
        
        List<String> resultArr = new ArrayList<>();
        
        for (String x: X.split("")) {
            if (countMapY.containsKey(x) && countMapY.get(x) > 0) {
                resultArr.add(x);
                countMapY.put(x, countMapY.get(x)-1);
            }
        }
        
        if (resultArr.isEmpty()) {
            return "-1";
        }
        
        Collections.sort(resultArr, Comparator.reverseOrder());
        
        if(resultArr.get(0).equals("0")) {
            return "0";
        } else {
            return String.join("", resultArr);
        }
    }
}