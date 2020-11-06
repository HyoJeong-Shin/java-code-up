package 입출력문및연산자;

import java.util.Scanner;

public class Q1018_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String[] arr = time.split(":");
		
		System.out.printf("%s:%s",arr[0],arr[1]);
		sc.close();
	}

}

// split() : 공백 및 문자열 기준으로 구