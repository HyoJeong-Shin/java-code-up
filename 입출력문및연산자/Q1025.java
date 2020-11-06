package 입출력문및연산자;

import java.util.Scanner;

public class Q1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		String[] arr = String.valueOf(num).split("");
		int[] arr2 = new int[arr.length];
		
		for (int i=0; i<arr.length; i++) {
			arr2[i] = Integer.parseInt(arr[i]);
			arr2[i] = (int) (arr2[i] * Math.pow(10, (arr.length-1)-i));
		}
		
		for(int a: arr2) {
			System.out.printf("[%d]\n", a);
		}
	}

}

// Math.pow(대상숫자, 지수) : 거듭제곱 구하기 