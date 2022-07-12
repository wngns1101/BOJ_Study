import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int loc[] = new int[26];
		for (int i = 0; i < loc.length; i++) {
			loc[i] = -1;
		}
		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (loc[ch - 'a'] == -1) {
				loc[ch - 'a'] = i;
			}
		}

		for (int i = 0; i < loc.length; i++) {
			System.out.print(loc[i] + " ");
		}

	}
}
