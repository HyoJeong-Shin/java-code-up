package 문자열;

import java.util.Scanner;

public class Q1295 {
// 알파벳 대소문자 변환 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		sc.close();
		
		char[] arr = text.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			if('A'<=arr[i]&&arr[i]<='Z') {
				arr[i] = Character.toLowerCase(arr[i]);
			}
			else if('a'<=arr[i]&&arr[i]<'z') {
				arr[i] = Character.toUpperCase(arr[i]);
			}
		}
		
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}

}
