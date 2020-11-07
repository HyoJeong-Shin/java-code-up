package if_else;

import java.util.Scanner;

public class Q1069 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char score = sc.next().charAt(0);
		sc.close();
		
		if(score=='A') {
			System.out.println("best!!!");
		}else if(score=='B') {
			System.out.println("good!!");
		}else if(score=='C') {
			System.out.println("run!");
		}else if(score=='D') {
			System.out.println("slowly~");
		}else {
			System.out.println("what?");
		}
	}

}
