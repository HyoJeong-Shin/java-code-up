package 단순반복문;

import java.util.Scanner;

public class Q1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;
		
		for(int i=1; sum<n; i++) {
			sum+=i;
		}
		
		System.out.print(sum);
	}

}
