import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cycleNum = Integer.parseInt(br.readLine());
		int orignNum = cycleNum;
		int index = 0;
		while (true) {
			if (cycleNum < 10) {
				cycleNum = cycleNum * 11;
				++index;
			} else {
				int a = cycleNum / 10;
				int b = cycleNum % 10;
				int x = (a + b) % 10;
				cycleNum = (b * 10) + x;
				++index;
			}
			if (cycleNum == orignNum) {
				System.out.println(index);
				break;
			}
		}
	}
}