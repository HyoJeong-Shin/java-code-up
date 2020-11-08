package 중첩반복문;

import java.util.Scanner;

public class Q1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		
		
		for(int i=1; i<=15; i++) {
			System.out.printf("%s*%X=%X\n",a, i, Integer.parseInt(a,16)*i);
		}
		
		
	}

}

// 10진수 -> 2진수 : Integer.toBinaryString(i);
// 10진수 -> 8진수 : Integer.toOctalString(i);
// 10진수 -> 16진수 : Integer.toHexString(i);

// 2진수 -> 10진수 : Integer.parseInt(i, 2);
// 8진수 -> 10진수 : Integer.parseInt(i, 8);
// 16진수 -> 10진수 : Integer.parseInt(i, 16);
