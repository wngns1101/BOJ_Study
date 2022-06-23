import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int no1 = Integer.parseInt(str[0]);
		int no2 = Integer.parseInt(str[1]);
		String str1 = br.readLine();
		int no3 = Integer.parseInt(str1);
		
		if(no2 + no3 >= 60) {
			int time = (no2 + no3) / 60;
			if(no1 + time >= 24) {
				no1 = (no1 + time) - 24;
			}else {
				no1 = no1 + time;
			}
			int min = (no2 + no3) % 60;
			no2 = min;
		} else {
			no2 = no2 + no3;
		}
		System.out.println(no1 + " " + no2);
	}
}