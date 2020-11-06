package 입출력문및연산자;

import java.util.Scanner;

public class Q1064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", (a<b?a:b)<c?(a<b?a:b):c );
	}

}
