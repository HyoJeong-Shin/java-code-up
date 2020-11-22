package 문자열;

import java.util.Scanner;

public class Q1733 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String word = sc.next();
		sc.close();
		
		if(word.equals("IOI")) {
			System.out.print("IOI is the International Olympiad in Informatics.");
		}else{
			System.out.print("I don't care.");
		}
	}

}
