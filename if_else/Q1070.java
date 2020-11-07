package if_else;

import java.util.Scanner;

public class Q1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		sc.close();
		
		if(month==12||month==1||month==2) {
			System.out.println("winter");
		}else if(month>2 && month<6) {
			System.out.println("spring");
		}else if(month>5 && month<9) {
			System.out.println("summer");
		}else {
			System.out.println("fall");
		}
	}

}
