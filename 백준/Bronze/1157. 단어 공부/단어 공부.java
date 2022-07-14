import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split("");
		String[] sletter = "abcdefghijklmnopqrstuvwxyz".split("");
		String[] cletter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?".split("");
		int[] num = new int[26];
		String sum = null;
		int max = 0;
		int index = 0;

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < sletter.length; j++) {
				if (str[i].equals(sletter[j]) || str[i].equals(cletter[j])) {
					++num[j];
				}
			}
		}

		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0) {
				sum += "/";
				sum += Integer.toString(i);
			}
		}
		String[] slice = sum.split("/");
		for (int i = 1; i < slice.length; i++) {
			if (num[Integer.parseInt(slice[i])] > max) {
				max = num[Integer.parseInt(slice[i])];
				index = Integer.parseInt(slice[i]);
			} else if (num[Integer.parseInt(slice[i])] == max) {
				index = 26;
			}
		}

		System.out.println(cletter[index]);
	}
}