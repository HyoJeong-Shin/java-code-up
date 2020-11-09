package if_else;

import java.util.Scanner;

public class Q1158 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if((n>=30 && n<=40)||(n>=60 && n<=70))
			System.out.print("win");
		else
			System.out.print("lose");
	}

}
