class Solution {
    public boolean solution(String s) {
        try{
            String[] splitNum = s.split("");
            int num = Integer.parseInt(s);
            
            if (splitNum.length == 4 || splitNum.length == 6){
                return true;
            } else {
                return false;
            }
        
        }catch (Exception e) {
            return false;
        }
    }
}