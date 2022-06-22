import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] arr = str.split(" ");
		int no1 = Integer.parseInt(arr[0]);
		int no2 = Integer.parseInt(arr[1]);
		if(no1 > no2) {
			System.out.println(">");
		}else if(no1 < no2) {
			System.out.println("<");
		}else if(no1 == no2) {
			System.out.println("==");
		}else {
			return;
		}
	}
}