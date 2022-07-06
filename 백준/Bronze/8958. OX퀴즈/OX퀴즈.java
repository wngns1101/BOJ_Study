import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int result = 0;
			int sum = 0;
			String str[] = br.readLine().split("");
			for (int j = 0; j < str.length; j++) {
				if (str[j].equals("O")) {
					result++;
				} else{
					result=0;
				}
				sum += result;
			}
			System.out.println(sum);
		}
	}
}