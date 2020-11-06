package 입출력문및연산자;

import java.util.Scanner;

public class Q1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Long n = sc.nextLong();
		sc.close();
		
		System.out.print(++n);
	}

}

// 증감 연산자 
// ++n : 변수를 사용하기 전에 증감 먼저 수행 (증가한 값으로 출력)
// n++ :변수에 저장되어 있는 값을 먼저 사용하고 난 후 나중에 증감을 수행 (증가하지 않은 값으로 출)