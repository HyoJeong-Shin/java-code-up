package _2차원배열;

import java.util.Scanner;

public class Q1472 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		int data = n*m;
		
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				for(int j=0; j<m; j++) {
					arr[i][j] = data;
					data -= 1;
				}
			}else {
				for(int j=m-1; j>-1; j--) {
					arr[i][j] = data;
					data -=1;
				}
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
