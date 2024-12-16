import java.util.*;
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int result = 0;
        int num = Integer.parseInt(br.readLine());
        
        int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(nums);
        
        for (int i=0; i<nums.length; i++) {
            int find = nums[i];
            int leftPointer = 0;
            int rightPointer = nums.length-1;
            
            while (leftPointer < rightPointer) {
                 if (leftPointer == i) { // 현재 찾는 값과 leftPointer가 동일하면 스킵
                    leftPointer++;
                    continue;
                }
                if (rightPointer == i) { // 현재 찾는 값과 rightPointer가 동일하면 스킵
                    rightPointer--;
                    continue;
                }
                
                int sum = nums[leftPointer] + nums[rightPointer];
                
                if (sum == find) {
                    result++;
                    break; // 중복 카운팅 방지
                } else if (sum < find) {
                    leftPointer++; // 합이 작으면 leftPointer를 증가
                } else {
                    rightPointer--; // 합이 크면 rightPointer를 감소
                }
            }
        }
        System.out.println(result);
    }
}