package _1차원배열;

import java.util.Scanner;

public class Q1095 {

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
		
		int min =arr[0];
		
		for(int i=0; i<n; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.print(min);
		
	}

}
