package _1차원배열;

import java.util.Scanner;

public class Q1403 {
// 배열 두번 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n;
		int[] arr = new int[k];
		
		for(int i=0; i<k; i++) {
			n = sc.nextInt();
			arr[i] = n;
		}
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<k; j++) {
				System.out.println(arr[j]);
			}
		}
	}

}
