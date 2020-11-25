package _2차원배열;

import java.util.Scanner;

public class Q1470 {
// 2차원 배열 지그재그 채우기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		int data = 1;
		
		for(int i=0; i<n; i++) {
			if(i%2!=0) {
				for(int j=n-1; j>-1; j--) {
					arr[j][i] = data;
					data++;
				}
				
			}else {
				for(int j=0; j<n; j++) {
					arr[j][i] = data;
					data++;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
