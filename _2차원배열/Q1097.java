package _2차원배열;

import java.util.Scanner;

public class Q1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[20][20];
		for(int i=1; i<20; i++) {
			for(int j=1; j<20; j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for(int j=1; j<20; j++) {	// 가로줄 뒤집기 	
				if(arr[a][j] == 0)
					arr[a][j] = 1;
				else
					arr[a][j] = 0;
			}
			for(int k=1; k<20; k++) {	// 세로줄 뒤집기 
				if(arr[k][b] == 0)
					arr[k][b] = 1;
				else
					arr[k][b] = 0;
			}	
		}
		
		sc.close();
		
		for(int i=1; i<20; i++) {
			for(int j=1; j<20; j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
