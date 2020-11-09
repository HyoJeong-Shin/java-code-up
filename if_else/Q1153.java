package if_else;

import java.util.Scanner;

public class Q1153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a>b)
			System.out.print(">");
		else if(b>a)
			System.out.print("<");
		else
			System.out.print("=");
	}

}
