import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split("");
		int sum = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("A") | str[i].equals("B") | str[i].equals("C")) {
				sum += 3;
			} else if (str[i].equals("D") | str[i].equals("E") | str[i].equals("F")) {
				sum += 4;
			} else if (str[i].equals("G") | str[i].equals("H") | str[i].equals("I")) {
				sum += 5;
			} else if (str[i].equals("J") | str[i].equals("K") | str[i].equals("L")) {
				sum += 6;
			} else if (str[i].equals("M") | str[i].equals("N") | str[i].equals("O")) {
				sum += 7;
			} else if (str[i].equals("P") | str[i].equals("Q") | str[i].equals("R") | str[i].equals("S")) {
				sum += 8;
			} else if (str[i].equals("T") | str[i].equals("U") | str[i].equals("V")) {
				sum += 9;
			} else if (str[i].equals("W") | str[i].equals("X") | str[i].equals("Y") | str[i].equals("Z")) {
				sum += 10;
			}
		}
		System.out.println(sum);
	}
}