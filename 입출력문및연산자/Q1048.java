package 입출력문및연산자;

import java.util.Scanner;

public class Q1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.print(a<<b);
	}

}

// a<<1 : a*2
// a<<2 : a*(2^2)
// a<<3 : a*(2^3)
// a<<b : a*(2^b)