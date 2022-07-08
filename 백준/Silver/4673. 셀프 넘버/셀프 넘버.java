import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		selfNum selfnum = new selfNum();
		selfnum.num();
	}
}

class selfNum {
	public void num() {
		int i = 1;
		int sum = 0;
		int arr[] = new int[10000];
		for (int j = 0; j < 10000; j++) {
			arr[j] = j;
		}
		while (true) {	
			if(i < 100) {
				sum = i + (i / 10) + i % 10;
			}else if(i >= 100 & i<1000) {
				sum = i + i / 100 + (i / 10) % 10 + (i % 100)%10;
			}else {
				sum = i + i / 1000 + (i / 100) % 10 + ((i / 10) % 100) % 10 + ((i % 1000)%100)%10;
			}
				
			if (sum < 10000) {
				arr[sum] = 0;
			} else {
				break;
			}
			++i;
		}
		
		for (int k = 0; k < 9994; k++) {
			if (arr[k] == 0) {
				continue;
			} else {
				System.out.println(arr[k]);
			}
		}
	}
}
