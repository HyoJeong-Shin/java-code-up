package 단순반복문;

import java.util.Scanner;

public class Q1075 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		while(a!=0) {
			System.out.println(--a);
		}
	}

}
