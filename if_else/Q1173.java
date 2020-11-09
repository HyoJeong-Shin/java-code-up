package if_else;

import java.util.Scanner;

public class Q1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		sc.close();
		
		
		if(min<30) {
			if(hour==0)
				hour+=24;
			System.out.printf("%d %d", hour-1, (60+min)-30);
		}
		else
			System.out.printf("%d %d", hour, min-30);
	}

}
