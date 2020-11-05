package 입출력문및연산자;

import java.util.Scanner;

public class Q1010 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);	// Scanner 객체 생성 
		int number = sc.nextInt();
		System.out.println(number);
		sc.close(); // 입력 종료 후 스캐너 닫기 
	}

}

// Scanner 클래스 : 사용자로부터 입력을 받기 위해 사용하는 클래스 

// Scanner 클래스의 여러 메소드들

// nextInt(): 정수형 입력 받을 때 사용, 
// 띄어쓰기나 개행문자가 나올때까지 값을 받음 

// next(): 문자열을 입력 받을 때 사용, 
// 공백이 나오기 전까지만 값을 입력받음

// nextLine(): 개행문자(\n-엔터)가 나오기 전까지 값을 입력 받음 
// 4bytes(32bits)까지 값을 받을 수 있음 

// nextLong(): 정수형(long형) 변수를 입력 받음
// 8bytes(64bits)까지 입력 받을 수 있음

// nextDouble() : 실수형(double) 변수를 입력 받음
// nextFloat() : 실수형(float) 변수를 입력 받음 