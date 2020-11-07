package 단순반복문;

import java.util.Scanner;

public class Q1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 1;	//처음 조건 검사를 넘어가기 위해 0이 아닌 값 입력 
		
		while(n!=0) {
			n = sc.nextInt();
			if(n==0) break;
			System.out.println(n);
		}
		
		sc.close();
	}

}
