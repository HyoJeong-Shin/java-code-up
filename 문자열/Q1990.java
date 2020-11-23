package 문자열;

import java.util.Scanner;

public class Q1990 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n%3==0)	
			System.out.print(1);
		else
			System.out.print(0);
	}

}
