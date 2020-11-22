package 문자열;

import java.util.Scanner;

public class Q1408 {
// 암호 처리 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		sc.close();
		
		for(int i=0; i<password.length(); i++) {
			System.out.print((char)(password.charAt(i)+2));
		}
		System.out.println();
		
		for(int i=0; i<password.length(); i++) {
			System.out.print((char)((password.charAt(i)*7)%80 + 48));
		}
	}

}
