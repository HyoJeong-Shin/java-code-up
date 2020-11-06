package 입출력문및연산자;

import java.util.Scanner;

public class Q1055 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if (a==1||b==1)
			System.out.print(1);
		else
			System.out.print(0);
	}

}
