package if_else;

import java.util.Scanner;

public class Q1068 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		sc.close();
		
		if(score>=90 && score<=100) {
			System.out.println("A");
		}else if(score>=70 && score<=89){
			System.out.println("B");
		}else if(score>=40 && score<=69) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
	}

}
