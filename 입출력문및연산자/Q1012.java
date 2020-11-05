package 입출력문및연산자;

import java.util.Scanner;

public class Q1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float number = sc.nextFloat();
		System.out.printf("%f", number);
		sc.close();
	}

}

// println() : 자바에서의 기본 출력문, 출력하고 싶은 내용 그대로를 입력하여 출력
// println()은 변수의 값을 그대로 출력하여 값을 변환하지 않고는 다른 형식으로 출력할 수 없음

// printf() : 지시자를 통해 변수의 값을 여러 가지 형식으로 변환하여 출력 가능
// %b : boolean 형식
// %d : 정수 형식
// %o : 8진수 정수 형식
// %x 또는 %X : 16진수 정수 형식
// %f : 소수점 형식 
// %c : 문자 형식
// %s : 문자열 형식
// %[-][0][n][.m]지시자 
// n : 출력할 전체 자리수 지정 ex) %3d : 전체자리수가 3인 정수
// 0 : 전체 자리수가 지정된 경우 왼쪽의 남는 자리에 0을 출력
// - : 전체 자리수가 지정된 경우 왼쪽 정렬하고 빈칸에 공백 출력
// .m : 소수점 아래 자리 지정. 잘리는 소수점 자리수는 반올림 시켜서 표