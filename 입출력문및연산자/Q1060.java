package 입출력문및연산자;

import java.util.Scanner;

public class Q1060 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a&b);
	}

}
// & : 정수 두 개를 비트단위로 and 연산함 (앰퍼센드) 
//     둘 다 1일 경우만 1로 계산 나머지는 0으로 계산 
