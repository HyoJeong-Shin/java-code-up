package _2차원배열;

import java.util.Scanner;

public class Q1464 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		int data = n*m;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = data;
				data--;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
