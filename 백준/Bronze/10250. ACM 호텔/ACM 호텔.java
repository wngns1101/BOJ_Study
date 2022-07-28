import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String index = br.readLine();
		int result = 0;
		for (int i = 0; i < Integer.parseInt(index); i++) {
			String str[] = br.readLine().split(" ");

			int H = Integer.parseInt(str[0]);
			int N = Integer.parseInt(str[2]);

			if (N % H == 0) {
				result = (H * 100) + (N / H);
			} else {
				result = (((N % H) * 100) + (N / H) + 1);
			}
			System.out.println(result);
		}
	}
}