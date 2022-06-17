import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String[] b = a.split(" ");
		int no1 = Integer.parseInt(b[0]);
		int no2 = Integer.parseInt(b[1]);
		int no3 = Integer.parseInt(b[2]);
		System.out.println((no1+no2)%no3);
		System.out.println(((no1%no3)+(no2%no3))%no3);
		System.out.println((no1*no2)%no3);
		System.out.println(((no1%no3)*(no2%no3))%no3);
	}
}
