package _2차원배열;

import java.util.Scanner;

public class Q1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[10][10];
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				int pos = sc.nextInt();
				arr[i][j] = pos; 
			}
		}
		
		sc.close();
		
		int x =1, y =1;
		while(true) {
			if(arr[x][y] == 0) {
				arr[x][y] = 9;
			}else if(arr[x][y] == 2) {
				arr[x][y] = 9;
				break;
			}
			if((arr[x][y+1] == 1 && arr[x+1][y] == 1) || (x ==9 && y ==9)){
				break;
			}
			if(arr[x][y+1] != 1) {
				y+=1;
			}else if(arr[x+1][y] != 1) {
				x+=1;
			}
		}
		
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
	}

}
