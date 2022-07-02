import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		String str[] = br.readLine().split(" ");
		int max = -1000001;
		int min = 1000001;
		for (int i = 0; i < index; i++) {
			if (Integer.parseInt(str[i]) > max) {
				max = Integer.parseInt(str[i]);
			}
			if (Integer.parseInt(str[i]) < min) {
				min = Integer.parseInt(str[i]);
			}
		}
		System.out.println(min + " " + max);
	}
}