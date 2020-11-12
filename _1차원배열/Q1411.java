package _1차원배열;

import java.util.Scanner;

public class Q1411 {
// 빠진 카드 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n-1; i++)
			arr[i] = sc.nextInt();
		
		int sum = 0;
		
		for(int i=0; i<n-1; i++)
			sum+=arr[i];
		
		System.out.print((n*(n+1)/2) - sum);
	}

}
