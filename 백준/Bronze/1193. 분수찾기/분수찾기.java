import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int a = 0;
		int count = x;
		int index = 1;
		int i = 1;
		int result1 = 0;
		int result2 = 0;

		while (true) {
			if (count - i > 0) {
				count -= i;
				a += i;
				index++;
			} else {
				break;
			}
			i++;
		}
		
		if (index % 2 == 0) {
			int b = x - a;
			if (b == 0) {
				result1 = 1;
				result2 = index;
			} else {
				result1 = b;
				result2 = index - (b - 1);
			}
		} else {
			int b = x - a;
			if (b == 0) {
				result1 = index;
				result2 = 1;
			} else {
				result1 = index - (b - 1);
				result2 = b;
			}
		}

		System.out.println(result1 + "/" + result2);
	}
}