import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		String a[] = str[0].split("");
		String b[] = str[1].split("");
		int no1 = Integer.parseInt(a[2]) * 100 + Integer.parseInt(a[1]) * 10 + Integer.parseInt(a[0]);
		int no2 = Integer.parseInt(b[2]) * 100 + Integer.parseInt(b[1]) * 10 + Integer.parseInt(b[0]);
		if (no1 > no2) {
			System.out.println(no1);
		} else {
			System.out.println(no2);
		}
	}
}