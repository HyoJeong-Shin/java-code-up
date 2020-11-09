package if_else;

import java.util.Scanner;

public class Q1165 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		int score = sc.nextInt();
		sc.close();
		
		while(time<90) {
			time += 5;
			score += 1;
		}
		
		System.out.print(score);
	}

}

/*
 * if(time %10 == 0)
			System.out.print(score + (90-time)/5);
		else
			System.out.print(score + (90-time)/5 +1);
 */