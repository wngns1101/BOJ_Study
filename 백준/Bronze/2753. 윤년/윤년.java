import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int no1 = Integer.parseInt(str);
		if (no1 % 4 == 0) {
			if (no1 % 400 == 0) {
				System.out.println("1");
			}else if(no1 % 100 == 0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		} else {
			System.out.println("0");
		}
	}
}