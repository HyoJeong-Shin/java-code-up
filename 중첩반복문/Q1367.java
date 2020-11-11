package 중첩반복문;

import java.util.Scanner;

public class Q1367 {
// 평행사변형 출력하기 1 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++) {
			for(int j=n-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
