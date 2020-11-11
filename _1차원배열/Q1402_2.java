package _1차원배열;

import java.util.Scanner;

public class Q1402_2 {
// 거꾸로 출력하기 3	// 함수 미사용 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data;
		int[] store = new int[n];
		
		for(int i=0; i<n; i++) {
			data = sc.nextInt();
			store[i] = data;
		}
		
		sc.close();
		
		for(int i=n-1; i>-1; i--) {
			System.out.printf("%d ",store[i]);
		}
	}

}
