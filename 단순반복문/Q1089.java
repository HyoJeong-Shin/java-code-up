package 단순반복문;

import java.util.Scanner;

public class Q1089 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		System.out.print(a+d*(n-1));
		
	}

}
