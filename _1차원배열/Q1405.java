package _1차원배열;

import java.util.Scanner;

public class Q1405 {
// 숫자 로테이션 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k;
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			k = sc.nextInt();
			arr[i] = k;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				System.out.printf("%d ", arr[j]);
			}
			for(int j=0; j<i; j++) {
				System.out.printf("%d ", arr[j]);
			}
			System.out.println();
		}
	}

}
