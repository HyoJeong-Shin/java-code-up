package 입출력문및연산자;

import java.util.Scanner;

public class Q1059 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", ~a);
	}

}

// ~a : 비트단위 연산자(틸드) 정수를 비트단위로 참/거짓을 바꿔주는 연산자 1->0, 0->1