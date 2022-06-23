import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readline().split(" ");
		int no1 = Integer.parseInt(arr[0]);
		int no2 = Integer.parseInt(arr[1]);
		if(no2 < 45) {
			no1--;
			no2 += 15;
			if(no1 < 0) {
				no1 = 23;
			}
		}else {
			no2 -=45;
		}
		System.out.println(no1 + " " + no2);
	}
}
