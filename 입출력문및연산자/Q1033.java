package 입출력문및연산자;

import java.util.Scanner;

public class Q1033 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		System.out.printf("%X", num);
	}

}

// %X : 16진수 대문자로 출력 