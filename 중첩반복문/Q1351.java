package 중첩반복문;

import java.util.Scanner;

public class Q1351 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		sc.close();
		
		for(int i=start; i<=end; i++) {
			for(int j=1; j<10; j++) 
				System.out.printf("%d*%d=%d\n",i,j,i*j);
		}
	}

}
