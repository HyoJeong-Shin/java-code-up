package 입출력문및연산자;

import java.util.Scanner;

public class Q1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.next();
		sc.close();
		
		String[] arr = date.split("\\.");
		int[] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.printf("%02d-%02d-%04d", arr2[2], arr2[1], arr2[0]);
	}

}
