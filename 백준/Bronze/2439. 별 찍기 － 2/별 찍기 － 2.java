import java.io.*;

public class Main {
	   public static void main(String[] args) throws IOException {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	      int N = Integer.parseInt(br.readLine());

	      for (int i = 0; i < N; i++) {
	         for (int j = 1; j < N - i; j++) {
	            System.out.print(" ");
	         }
	         for(int t = 1; t <= i+1; t++ ) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }
	   }
	}