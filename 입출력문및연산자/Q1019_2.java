package 입출력문및연산자;

import java.util.Scanner;

public class Q1019_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		sc.close();

		String[] arr = date.split("\\.");
		
		int[] arr2 = new int[arr.length];
		for (int i = 0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.printf("%04d.%02d.%02d", arr2[0], arr2[1], arr2[2]);
	}

}
