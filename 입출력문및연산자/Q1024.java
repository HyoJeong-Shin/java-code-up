package 입출력문및연산자;

import java.util.Scanner;

public class Q1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String[] arr = word.split("");
		
		for(String a : arr) {
			System.out.printf("'%s'\n", a);
		}
		
	}

}
