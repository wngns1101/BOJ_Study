import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split("");
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("c")) {
				if (i < str.length - 1) {
					if (str[i + 1].equals("=")) {
						++i;
					} else if (str[i + 1].equals("-")) {
						++i;
					}
				}
			} else if (str[i].equals("d")) {
				if (i < str.length - 1) {
					if (str[i + 1].equals("z")) {
						if (i < str.length - 2) {
							if (str[i + 2].equals("=")) {
								i += 2;
							}
						}
					} else if (str[i + 1].equals("-")) {
						++i;
					}
				}
			} else if (str[i].equals("l")) {
				if (i < str.length - 1) {
					if (str[i + 1].equals("j")) {
						++i;
					}
				}
			} else if (str[i].equals("n")) {
				if (i < str.length - 1) {
					if (str[i + 1].equals("j")) {
						++i;
					}
				}
			} else if (str[i].equals("s")) {
				if (i < str.length - 1) {
					if (str[i + 1].equals("=")) {
						++i;
					}
				}
			} else if (str[i].equals("z")) {
				if (i < str.length - 1) {
					if (str[i + 1].equals("=")) {
						++i;
					}
				}
			}
			++index;
		}
		System.out.println(index);
	}
}