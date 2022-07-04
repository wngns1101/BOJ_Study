import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean arr[] = new boolean[42];
		int count = 0;
		for (int i = 0; i < 10; i++) {
			int num = (Integer.parseInt(br.readLine())) % 42;
			arr[num] = true;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				count++;
			}
		}
		System.out.println(count);
	}
}