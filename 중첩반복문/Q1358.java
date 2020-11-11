package 중첩반복문;

import java.util.Scanner;

public class Q1358 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i+=2) {
			for(int j=i; j<n; j+=2) {
				System.out.print(" ");
			}
			for(int k=1;k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
