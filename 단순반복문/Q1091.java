package 단순반복문;

import java.util.Scanner;

public class Q1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
		Long m = sc.nextLong();
		Long d = sc.nextLong();
		Long n = sc.nextLong();
		sc.close();
		
		for (int i=1; i<n; i++) {
			a = a*m+d;
		}
		System.out.print(a);
	}

}
