package 입출력문및연산자;

import java.util.Scanner;

public class Q1032 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.printf("%x", num);
	}

}

// %x : 16진수 소문자 출력 