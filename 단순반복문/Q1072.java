package 단순반복문;

import java.util.Scanner;

public class Q1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a;
		
		for(int i=0; i<n; i++) {
			a = sc.nextInt();
			System.out.println(a);
		}
		
		sc.close();
	}

}
