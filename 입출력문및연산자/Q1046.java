package 입출력문및연산자;

import java.util.Scanner;

public class Q1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		System.out.printf("%d\n%.1f", a+b+c, (float)(a+b+c)/3);
	}

}
