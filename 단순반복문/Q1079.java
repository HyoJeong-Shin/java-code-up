package 단순반복문;

import java.util.Scanner;

public class Q1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			char text = sc.next().charAt(0);
			System.out.println(text);
			if (text=='q')	break;
		}
		
		sc.close();

	}

}
