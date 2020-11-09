package if_else;

import java.util.Scanner;

public class Q1168 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int birth = sc.nextInt();
		int gender = sc.nextInt();
		sc.close();
		
		if(gender==1 || gender==2)
			System.out.print(2012-(1900+birth/10000)+1);
		else
			System.out.print(2012-(2000+birth/10000)+1);
	}

}
