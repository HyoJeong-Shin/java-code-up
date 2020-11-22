package 문자열;

import java.util.Scanner;

public class Q2721 {
// 순환 문자열 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		sc.close();
		
		if((s1.charAt(s1.length()-1)==s2.charAt(0))&&(s2.charAt(s2.length()-1)==s3.charAt(0))&& (s3.charAt(s3.length()-1)==s1.charAt(0))){
					System.out.print("good");
		}else {
			System.out.print("bad");
		}
	}

}
