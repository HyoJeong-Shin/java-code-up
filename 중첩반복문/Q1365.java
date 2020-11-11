package 중첩반복문;

import java.util.Scanner;

public class Q1365 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0||i==n-1||j==i||j==n-1-i||j==0||j==n-1)	//첫번째줄, 마지막 줄, j==i일때, j==n-1-i일 때, j첫번째칸, 마지막 칸	//대각선이 포함된 n*n 사각형을 출력 
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
