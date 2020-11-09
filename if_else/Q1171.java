package if_else;

import java.util.Scanner;

public class Q1171 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		int classnum = sc.nextInt();
		int id = sc.nextInt();
		sc.close();
		
		System.out.printf("%d%02d%03d", grade, classnum, id);
	}

}
