package 중첩반복문;

import java.util.Scanner;

public class Q1370 {
// 지그재그 출력하기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();	// 높이 
		int r = sc.nextInt();	// 반복횟수 
		sc.close();
		
		
		for(int x=0; x<r; x++) {
			for(int i=0; i<h; i++) {
				for(int j=i; j>0; j--) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
			for(int i=1; i<h; i++) {
				for(int j=i; j<h-1; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
	}

}
