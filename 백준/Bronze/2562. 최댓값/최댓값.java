import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		int max = 0;
		int index = 0;
		for (int i = 0; i < 9; i++) {
			list.add(Integer.parseInt(br.readLine()));
			if(list.get(i) > max) {
				max = list.get(i);
				index = i+1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}