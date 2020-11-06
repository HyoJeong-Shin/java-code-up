package 입출력문및연산자;

import java.util.Scanner;

public class Q1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		float mb = (float)w*h*b/8/1024/1024;
		System.out.printf("%.2f MB", mb);
		
	}

}
