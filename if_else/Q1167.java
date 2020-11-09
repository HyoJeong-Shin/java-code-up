package if_else;

import java.util.Scanner;

public class Q1167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a<=c&&a<=b) {
			if(c<b)
				System.out.print(c);
			else
				System.out.print(b);
		}else if(b<=a&&b<=c) {
			if(a<c)
				System.out.print(a);
			else
				System.out.print(c);
		}else if(c<=a&&c<=b) {
			if(a<b)
				System.out.print(a);
			else
				System.out.print(b);
		}
	}

}

