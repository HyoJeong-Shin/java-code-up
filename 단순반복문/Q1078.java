package 단순반복문;

import java.util.Scanner;

public class Q1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0;
		
		for(int i=0; i<=a; i++) {
			if(i%2==0)	sum+=i;
		}
		
		System.out.print(sum);
	}

}
