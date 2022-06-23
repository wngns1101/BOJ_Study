import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String[] arr = str1.split(" ");
		int no1 = Integer.parseInt(arr[0]);
		int no2 = Integer.parseInt(arr[1]);
		if (no2 > 45) {
			if (no1 == 23) {
				no1 = 23;
				no2 = no2- 45;
			} else if (no1 == 0) {
				no1 = 0;
				no2 = no2- 45;
			} else if (no1 != 0 & no1 != 23) {
				no2 = no2- 45;
			}
		} else if (no2 < 45) {
			if (no1 == 23) {
				no1 = 22;
				no2 = no2 + 60 - 45;
			} else if (no1 == 0) {
				no1 = 23;
				no2 = no2 + 60 - 45;
			} else if (no1 != 0 & no1 != 23) {
				no1 = no1 - 1;
				no2 = no2 + 60 - 45;
			}
		} else if (no2 == 45) {
			no2 = 0;
		} else {
			return;
		}
		System.out.println(no1 + " " + no2);
	}
}