import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int index = Integer.parseInt(br.readLine());
		int sum = 0;
		String num[] = br.readLine().split("");
		for (int i = 0; i < index; i++) {
			sum += Integer.parseInt(num[i]);
		}
		System.out.println(sum);
	}
}