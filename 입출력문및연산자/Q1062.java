package 입출력문및연산자;

import java.util.Scanner;

public class Q1062 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a^b);
	}

}

// ^ : 정수 두 개를 비트단위로 xor연산 (서컴플렉스/카릿)
//     서로 다를 때 1 출력 