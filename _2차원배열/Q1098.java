package _2차원배열;

import java.util.Scanner;

public class Q1098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] arr = new int[w+1][h+1];
		
		for(int i=0; i<n; i++) {
			int l = sc.nextInt();
			int d = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int j=0; j<l; j++) {
				if(d==0){
					arr[x][y+j] = 1;
				}
				else{
					arr[x+j][y] = 1;
				}
			}
		}
		
		sc.close();

		for(int i=1; i<w+1; i++) {
			for(int j=1; j<h+1; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}
