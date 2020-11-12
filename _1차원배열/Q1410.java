package _1차원배열;

import java.util.Scanner;

public class Q1410 {
// 올바른 괄호1 (괄호 개수 세기)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bracket = sc.nextLine();
		
		String[] arr = bracket.split("");
		
		int count1 =0, count2 = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("(")) {
				count1 +=1;
			}
			else if(arr[i].equals(")")){
				count2 +=1;
			}
		}
		
		System.out.printf("%d %d", count1, count2);
	}

}
