package 단순반복문;

import java.util.Scanner;

public class Q1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		System.out.printf("%.0f", a*Math.pow(r, n-1));
	}

}
