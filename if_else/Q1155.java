package if_else;

import java.util.Scanner;

public class Q1155 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a%7==0)
			System.out.print("multiple");
		else
			System.out.print("not multiple");
	}

}
