package 입출력문및연산자;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		sc.close();
		
		StringTokenizer stn = new StringTokenizer(date, ".");
		
		String[] arr = new String[3];
		
		for(int i=0; i<3; i++) {
			arr[i]= stn.nextToken();
		}
		
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int day = Integer.parseInt(arr[2]);

		System.out.printf("%04d.%02d.%02d", year, month, day);
	}

}

// StringTokenizer(String str, String delim) : 문자열을 토큰으로 나눔 
// str : 분석할 문자열
// delim : 분리 문자로 사용할 문자
// nextToken()을 사용해 하나씩 배열에 담은 후 값이 문자열이니 다시 int형으로 변환한 뒤 출력함 