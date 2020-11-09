package if_else;

import java.util.Scanner;

public class Q1156 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if(n%2!=0)
			System.out.print("odd");
		else
			System.out.print("even");
	}

}
