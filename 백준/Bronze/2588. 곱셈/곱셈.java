import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		int no1 = Integer.parseInt(a);
		String b = br.readLine();
		int no2 = Integer.parseInt(b);
		int result1 = no1 * (no2%10);
		System.out.println(result1);
		int result2 = no1 * ((no2/10)%10);
		System.out.println(result2);
		int result3 = no1 * (no2/100);
		System.out.println(result3);
		int result4 = (no1 * no2);
		System.out.println(result4);
	}
}