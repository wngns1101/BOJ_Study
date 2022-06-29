import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int temp = Integer.parseInt(str[0]);
		int x = Integer.parseInt(str[1]);
		String nums[] = br.readLine().split(" ");
		for(int i=0; i<temp; i++) {
			if(x > Integer.parseInt(nums[i])) {
				System.out.print(nums[i] + " ");
			}
		}
	}
}