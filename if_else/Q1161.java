package if_else;

import java.util.Scanner;

public class Q1161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a%2!=0)
			System.out.print("홀수");
		else
			System.out.print("짝수");
		
		System.out.print("+");
		
		if(b%2!=0)
			System.out.print("홀수");
		else
			System.out.print("짝수");
		
		System.out.print("=");
		
		if((a+b)%2!=0)
			System.out.print("홀수");
		else 
			System.out.print("짝수");
	}

}

/*
		if(a%2==0&&b%2==0) 
			System.out.print("짝수+짝수=짝수");
		else if(a%2!=0&&b%2==0) 
			System.out.print("홀수+짝수=홀수");
		else if(a%2!=0&&b%2!=0) 
			System.out.print("홀수+홀수=짝수");
		else 
			System.out.print("짝수+홀수=홀수");
*/
