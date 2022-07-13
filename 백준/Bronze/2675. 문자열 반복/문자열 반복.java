import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int index = Integer.parseInt(br.readLine());
		for(int i=0; i<index; i++) {
			String[] str = br.readLine().split(" ");
			String[] arr = str[1].split("");
			for(int j=0; j<arr.length; j++) {
				for(int k=0; k<Integer.parseInt(str[0]); k++) {
					System.out.print(arr[j]);	
				}
			}
			System.out.println("");
		}
	}
}