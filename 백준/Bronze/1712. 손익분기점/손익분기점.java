import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String price[] = br.readLine().split(" ");
		int fixCost = Integer.parseInt(price[0]);
		int valCost = Integer.parseInt(price[1]);
		int selCost = Integer.parseInt(price[2]);
		if (selCost <= valCost) {
			System.out.println(-1);
		} else {
			System.out.println((fixCost / (selCost - valCost)) + 1);
		}

	}
}