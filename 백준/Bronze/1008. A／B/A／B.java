import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		double no1 = Double.parseDouble(arr[0]);
		double no2 = Double.parseDouble(arr[1]);
		System.out.println(no1 / no2);
	}
}