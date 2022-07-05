import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String sub[] = br.readLine().split(" ");
		float sum = 0;
		float max = 0;
		for (int i = 0; i < n; i++) {
			int score = Integer.parseInt(sub[i]);
			if (max < score) {
				max = score;
			}
		}
		for (int i = 0; i < n; i++) {
			int score = Integer.parseInt(sub[i]);
			sum += (score / max) * 100;
		}
		System.out.println(sum / n);
	}
}