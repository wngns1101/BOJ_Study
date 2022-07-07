import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		float avg = 0;
		for (int i = 0; i < index; i++) {
			float sum = 0;
			float num = 0;
			String str[] = br.readLine().split(" ");
			for (int j = 0; j < str.length - 1; j++) {
				sum += Float.parseFloat(str[j + 1]);
			}
			avg = sum / Float.parseFloat(str[0]);
			for (int k = 0; k < str.length - 1; k++) {
				if (Integer.parseInt(str[k + 1]) > avg) {
					++num;
				}
			}
			System.out.printf("%.3f%%\n", 100 * (num / Integer.parseInt(str[0])));
		}
	}
}