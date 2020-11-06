package 입출력문및연산자;

import java.util.Scanner;

public class Q1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.print(a<<1);
	}

}

// 왼쪽 비트시프트 연산자 : 오른쪽에 0이 주어진 개수만큼 추가되고, 2배로 곱한 값이 된다. 