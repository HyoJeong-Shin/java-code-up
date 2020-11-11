package 중첩반복문;

import java.util.Scanner;

public class Q1368 {
// 평행사변형 출력하기 2 // 공백의 방향, 높이, 밑변 정하여 만듦 
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();	// 높이 
		int k = sc.nextInt();	// 밑변 
		char d = sc.next().charAt(0);	// 방향 
		sc.close();
		
		for(int i=0; i<h; i++) {
			if(d=='L') {
				for(int j=0; j<i; j++) {
					System.out.print(" ");
				}
				for(int l=0; l<k; l++) {
					System.out.print("*");
				}
				System.out.println();
			}else if(d=='R') {
				for(int j=h-1; j>i; j--) {
					System.out.print(" ");
				}
				for(int l=0; l<k; l++) {
					System.out.print("*");
				}
				System.out.println();
				
			}
		}
	}

}
