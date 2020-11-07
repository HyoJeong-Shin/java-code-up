package 단순반복문;

import java.util.Scanner;

public class Q1092 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		int day = 1;
		
		while(day%a!=0||day%b!=0||day%c!=0) {	//day%a=0이고 day%b=0이고 day%c=0인 날 찾기 = 모두 함께 문제를 푸는 날  
			day++;
		}
		System.out.print(day);
		
	}

}
