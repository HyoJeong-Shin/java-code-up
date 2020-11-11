package _1차원배열;

import java.util.Scanner;

public class Q1409 {
// 기억력 테스트 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int[] arr = new int[11];
		
		for(int i=1; i<=10; i++) {
			num = sc.nextInt();
			arr[i] = num;
		}
		
		int k = sc.nextInt();
		sc.close();
		
		System.out.print(arr[k]);
	}

}
