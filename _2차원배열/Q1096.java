package _2차원배열;

import java.util.Scanner;

public class Q1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[20][20];
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
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
