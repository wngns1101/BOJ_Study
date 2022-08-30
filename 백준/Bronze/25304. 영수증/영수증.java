import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		int index = Integer.parseInt(br.readLine());
		for (int i = 0; i < index; i++) {
			String[] stuff = br.readLine().split(" ");
			total -= Integer.parseInt(stuff[0]) * Integer.parseInt(stuff[1]);
		}
		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}