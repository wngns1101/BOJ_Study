import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int loc[] = new int[26];
		for (int i = 0; i < loc.length; i++) {
			loc[i] = -1;
		}
		String arr[] = br.readLine().split("");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("a")) {
				if (loc[0] == -1) {
					loc[0] = i;
				}
			} else if (arr[i].equals("b")) {
				if (loc[1] == -1) {
					loc[1] = i;
				}
			} else if (arr[i].equals("c")) {
				if (loc[2] == -1) {
					loc[2] = i;
				}
			} else if (arr[i].equals("d")) {
				if (loc[3] == -1) {
					loc[3] = i;
				}
			} else if (arr[i].equals("e")) {
				if (loc[4] == -1) {
					loc[4] = i;
				}
			} else if (arr[i].equals("f")) {
				if (loc[5] == -1) {
					loc[5] = i;
				}
			} else if (arr[i].equals("g")) {
				if (loc[6] == -1) {
					loc[6] = i;
				}
			} else if (arr[i].equals("h")) {
				if (loc[7] == -1) {
					loc[7] = i;
				}
			} else if (arr[i].equals("i")) {
				if (loc[8] == -1) {
					loc[8] = i;
				}
			} else if (arr[i].equals("j")) {
				if (loc[9] == -1) {
					loc[9] = i;
				}
			} else if (arr[i].equals("k")) {
				if (loc[10] == -1) {
					loc[10] = i;
				}
			} else if (arr[i].equals("l")) {
				if (loc[11] == -1) {
					loc[11] = i;
				}
			} else if (arr[i].equals("m")) {
				if (loc[12] == -1) {
					loc[12] = i;
				}
			} else if (arr[i].equals("n")) {
				if (loc[13] == -1) {
					loc[13] = i;
				}
			} else if (arr[i].equals("o")) {
				if (loc[14] == -1) {
					loc[14] = i;
				}
			} else if (arr[i].equals("p")) {
				if (loc[15] == -1) {
					loc[15] = i;
				}
			} else if (arr[i].equals("q")) {
				if (loc[16] == -1) {
					loc[16] = i;
				}
			} else if (arr[i].equals("r")) {
				if (loc[17] == -1) {
					loc[17] = i;
				}
			} else if (arr[i].equals("s")) {
				if (loc[18] == -1) {
					loc[18] = i;
				}
			} else if (arr[i].equals("t")) {
				if (loc[19] == -1) {
					loc[19] = i;
				}
			} else if (arr[i].equals("u")) {
				if (loc[20] == -1) {
					loc[20] = i;
				}
			} else if (arr[i].equals("v")) {
				if (loc[21] == -1) {
					loc[21] = i;
				}
			} else if (arr[i].equals("w")) {
				if (loc[22] == -1) {
					loc[22] = i;
				}
			} else if (arr[i].equals("x")) {
				if (loc[23] == -1) {
					loc[23] = i;
				}
			} else if (arr[i].equals("y")) {
				if (loc[24] == -1) {
					loc[24] = i;
				}
			} else if (arr[i].equals("z")) {
				if (loc[25] == -1) {
					loc[25] = i;
				}
			}
		}

		for (int i = 0; i < loc.length; i++) {
			System.out.print(loc[i] + " ");
		}

	}
}