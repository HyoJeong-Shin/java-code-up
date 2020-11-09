package if_else;

import java.util.Scanner;

public class Q1163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		if(((year+month+day)%1000/100) % 2 == 0)
			System.out.print("대박");
		else
			System.out.print("그럭저럭");
		
	}

}
