package 입출력문및연산자;

import java.util.Scanner;

public class Q1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		sc.close();
		
		String[] arr = String.valueOf(num).split("\\.");
		
		for(String a : arr) {	// arr배열의 개수만큼 반복 
			System.out.println(a);	// arr배열의 값을 출력 
		}
		
	}

}

// String.valueOf() : 문자열로 타입 변환 