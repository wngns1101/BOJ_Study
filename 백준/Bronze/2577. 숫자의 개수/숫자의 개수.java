import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int mul = a * b * c;
		String str[] = Integer.toString(mul).split("");
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < str.length; i++) {
			int count = Integer.parseInt(str[i]);
			if (count == 0) {
				++arr[0];
			} else if (count == 1) {
				++arr[1];
			} else if (count == 2) {
				++arr[2];
			} else if (count == 3) {
				++arr[3];
			} else if (count == 4) {
				++arr[4];
			} else if (count == 5) {
				++arr[5];
			} else if (count == 6) {
				++arr[6];
			} else if (count == 7) {
				++arr[7];
			} else if (count == 8) {
				++arr[8];
			} else {
				++arr[9];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
