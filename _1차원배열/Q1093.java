package _1차원배열;

import java.util.Scanner;

public class Q1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num;
		
		int[] arr = new int[23];
		
		for(int i=0; i<n; i++) {
			num = sc.nextInt();
			arr[num-1]+=1;
		}
		sc.close();

		for(int i=0; i<23; i++){
			System.out.printf("%d ",arr[i]);
		}
	}

}
