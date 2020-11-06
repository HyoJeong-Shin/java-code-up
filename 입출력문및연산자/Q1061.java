package 입출력문및연산자;

import java.util.Scanner;

public class Q1061 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a|b);
	}

}

// | : 정수 두 개를 비트 단위로 or 연산 (버티컬바)
//     둘 중 하나라도 1인 자리를 1로 만듦 