package 단순반복문;

import java.util.Scanner;

public class Q1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++) {
			if(i%3==0)
				System.out.printf("%c ",'X');
			else
				System.out.printf("%d ", i);
		}
	}

}
