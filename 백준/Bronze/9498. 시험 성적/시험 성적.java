import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int no = Integer.parseInt(str);
		if(no>=90 & no<=100) {
			System.out.println("A");
		}else if(no>=80 & no<90) {
			System.out.println("B");
		}else if(no>=70 & no<80) {
			System.out.println("C");
		}else if(no>=60 & no<70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
