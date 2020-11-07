package 단순반복문;

import java.util.Scanner;

public class Q1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char en = sc.next().charAt(0);
		sc.close();
		
		char a = 'a';
		
		while(a<=en) {
			System.out.printf("%c ",a++);
		}
	}

}
