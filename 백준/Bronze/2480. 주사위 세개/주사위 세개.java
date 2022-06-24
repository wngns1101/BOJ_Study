import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int no1 = Integer.parseInt(str[0]);
		int no2 = Integer.parseInt(str[1]);
		int no3 = Integer.parseInt(str[2]);
		int result = 0;
		if (no1 == no2 && no2 == no3 && no1 == no3) {
			result = 10000 + (no1 * 1000);
		} else if (no1 != no2 && no2 != no3 && no1 != no3) {
			int max;
			if (no1 > no2) {
				max = no1;
			} else {
				max = no2;
			}
			if (max > no3) {

			} else {
				max = no3;
			}
			result = max * 100;
		} else {
			int equal = 0;
			if (no1 == no2) {
				equal = no1;
			} else if (no2 == no3) {
				equal = no2;
			} else if (no1 == no3) {
				equal = no3;
			}
			result = 1000 + equal * 100;
		}
		System.out.println(result);
	}
}