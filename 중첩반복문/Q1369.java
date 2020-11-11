package 중첩반복문;

import java.util.Scanner;

public class Q1369 {
// 빗금 친 사각형 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0||i==n-1||j==0||j==n-1) 
					System.out.print("*");
				else if((i+j+1)%k==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
