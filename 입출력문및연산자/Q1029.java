package 입출력문및연산자;

import java.util.Scanner;

public class Q1029 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		sc.close();
		
		System.out.printf("%.11f", num);
	}

}

// double 형식 지정자 : %f
// double : float보다 더 큰 범위 지정 가능 