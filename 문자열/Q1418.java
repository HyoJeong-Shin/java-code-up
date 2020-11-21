package 문자열;

import java.util.Scanner;

public class Q1418 {
// t를 찾아라 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		sc.close();
		
		String[] arr = text.split("");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("t")) {
				System.out.printf("%d ", i+1);
			}
		}
	}

}
