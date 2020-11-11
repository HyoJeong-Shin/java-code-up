package _1차원배열;

import java.util.Scanner;

public class Q1407 {
// 문자열 출력하기1 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		sc.close();
		
		String[] arr = text.split(" ");
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]);
	}

}
