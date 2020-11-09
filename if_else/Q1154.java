package if_else;

import java.util.Scanner;

public class Q1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a>b) 
			System.out.print(a-b);
		else
			System.out.print(b-a);
	}

}
