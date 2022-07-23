import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int i = 1;
		int count = 2;
		int result = 1;

		if (N == 1) {
			System.out.println(1);
		} else {
			while (true) {
				count += 6 * i;
				if (N < count) {
					result += i;
					break;
				}
				i++;
			}
			System.out.println(result);
		}
	}
}