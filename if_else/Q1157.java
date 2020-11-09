package if_else;

import java.util.Scanner;

public class Q1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float pos = sc.nextFloat();
		sc.close();
		
		if(pos>=50 && pos<=60)
			System.out.print("win");
		else
			System.out.print("lose");
	}

}
