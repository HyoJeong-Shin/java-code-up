package 입출력문및연산자;

import java.util.Scanner;

public class Q1063 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a>b?a:b);
	}

}

// 3항연산자 ? : "조건식 ? (참일 때의 값):(거짓일 때의 값)"