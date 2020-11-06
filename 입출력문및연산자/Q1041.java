package 입출력문및연산자;

import java.util.Scanner;

public class Q1041 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char text = sc.next().charAt(0);
		sc.close();
		
		System.out.print((char)((int)text + 1));	
	}

}
