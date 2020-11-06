package 입출력문및연산자;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		sc.close();
		/**/
		StringTokenizer stn = new StringTokenizer(time, ":");
		int hour = Integer.parseInt(stn.nextToken());
		int min = Integer.parseInt(stn.nextToken());
		int sec = Integer.parseInt(stn.nextToken());
		
		System.out.print(min);
	}

}

/* 배열 사용 코드
 * 
 * String[] arr = time.split(":");
 * int[] arr2 = new int[arr.length];
 * for(int i=0; i<arr.length; i++){
 * 		arr2[i] = Integer.parseInt(arr[i]);
 * }
 * System.out.print(arr2[1]);
 * 
 * 
 * 
 */