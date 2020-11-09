package if_else;

import java.util.Scanner;

public class Q1169 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		sc.close();
		
		if(2012-age+1>=2000)
			System.out.printf("%d %d",(2012-age+1)%100, 3);
		else
			System.out.printf("%d %d",(2012-age+1)%100, 1);
	}

}
