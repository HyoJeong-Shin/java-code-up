package _1차원배열;

import java.util.Scanner;

public class Q1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k;
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			k = sc.nextInt();
			arr[i] = k;
		}
		sc.close();
		
		for(int i=n-1; i>-1; i--) {
			System.out.printf("%d ", arr[i]);
		}
	}

}
