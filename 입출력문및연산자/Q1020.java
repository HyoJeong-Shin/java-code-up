package 입출력문및연산자;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		sc.close();
		
		StringTokenizer stn = new StringTokenizer(id, "-");
		String[] arr = new String[2];
		int[] arr2 = new int[2];
		
		for(int i=0; i<2; i++) {
			arr[i] = stn.nextToken();
			arr2[i] = Integer.parseInt(arr[i]);
		}
		
		System.out.printf("%06d%7d", arr2[0], arr2[1]);
	}

}

/* 입력 갯수와 상관없이 쓰고 싶을 때 작성 코드 
  StringTokenizer stn = new StringTokenizer(id, "-");
		String[] arr = new String[stn.countTokens()+1];
		int[] arr2 = new int[stn.countTokens()+1];
		
		for(int i=0; i<stn.countTokens()+1; i++) {
			arr[i] = stn.nextToken();
			arr2[i] = Integer.parseInt(arr[i]);
		}
 */

/* 문자열 그대로 입력하는 코드
 		StringTokenizer stn = new StringTokenizer(id, "-");
		
		String firstid = id.nextToken();
		String secondeid = id.nextToken();
		
		System.out.printf("%s%s", firstid, secondid);
 */