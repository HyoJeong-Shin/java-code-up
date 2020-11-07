package 단순반복문;

import java.util.Scanner;

public class Q1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		int sum = 0, i = 0;
		
		while(sum<a) {
			i++;
			sum += i;
		}
		System.out.print(i);
	}

}
