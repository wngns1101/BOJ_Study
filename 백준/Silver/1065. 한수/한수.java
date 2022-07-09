import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int index = 0;
		if (n < 100) {
			index = n;
		} else {
			index = 99;
			for (int i = 100; i <= n; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				if (hun - ten == ten - one) {
					index++;
				}
			}
		}
		System.out.println(index);
	}
}