import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no1 = Integer.parseInt(br.readLine());
		for(int i=1; i<10; i++) {
			System.out.println(no1 + " * " + i +" = " + (no1 * i));
		}
	}
}