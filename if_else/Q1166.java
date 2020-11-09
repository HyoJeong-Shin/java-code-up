package if_else;

import java.util.Scanner;

public class Q1166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		sc.close();
		
		if((year%4==0 && year%100!=0)||(year%400==0))
			System.out.print("yes");
		else
			System.out.print("no");
	}

}
