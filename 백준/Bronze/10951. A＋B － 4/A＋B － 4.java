import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = (new BufferedReader(new InputStreamReader(System.in)));
		String str;
		while ((str = br.readLine()) != null) {
			String arr[] = str.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			System.out.println(a + b);
		}
		br.close();
	}
}