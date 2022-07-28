import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String index = br.readLine();
		int result = 0;
		for (int i = 0; i < Integer.parseInt(index); i++) {
			String str[] = br.readLine().split(" ");
			if ((Integer.parseInt(str[2]) % Integer.parseInt(str[0])) == 0) {
				result = Integer.parseInt(str[0]) * 100 + Integer.parseInt(str[2]) / Integer.parseInt(str[0]);
			} else {
				result = (Integer.parseInt(str[2]) % Integer.parseInt(str[0])) * 100
						+ (Integer.parseInt(str[2]) / Integer.parseInt(str[0])) + 1;
			}
			System.out.println(result);
		}
	}
}