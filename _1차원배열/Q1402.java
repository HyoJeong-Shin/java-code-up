package _1차원배열;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1402 {
// 거꾸로 출력하기 3	// 함수 사용 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int data;
		String[] store = new String[n];
		
		for(int i=0; i<n; i++) {
			data = sc.nextInt();
			store[i] = String.valueOf(data);
		}
		
		sc.close();
		
		Arrays.sort(store, Collections.reverseOrder());
		
		for(int i=0; i<store.length; i++)
			System.out.printf("%s ",store[i]);
		
	}

}
