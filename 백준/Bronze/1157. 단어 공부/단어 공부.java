import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().toUpperCase().split("");
		String[] cLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?".split("");
		int word[] = new int[26];
		int max = 0;
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < cLetter.length; j++) {
				if (str[i].equals(cLetter[j])) {
					++word[j];
				}
			}
		}

		for (int i = 0; i < cLetter.length - 1; i++) {
			if (word[i] > 0) {
				if (word[i] > max) {
					max = word[i];
					index = i;
				} else if (word[i] == max) {
					index = 26;
				}
			}
		}

		System.out.println(cLetter[index]);
	}
}