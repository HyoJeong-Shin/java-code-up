package if_else;

import java.util.Scanner;

public class Q1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		sc.close();
		
		if((pos>=50 && pos<=70)||(pos%6==0))
			System.out.print("win");
		else
			System.out.print("lose");
	}

}
