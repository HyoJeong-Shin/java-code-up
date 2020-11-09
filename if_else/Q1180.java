package if_else;

import java.util.Scanner;

public class Q1180 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		
		String[] arr = n.split("");
		int amount = Integer.parseInt(arr[1]+arr[0])*2;
		
		if(amount>100) amount = amount-(amount/100)*100;
		System.out.println(amount);
				
		if(amount<=50)
			System.out.print("GOOD");
		else
			System.out.print("OH MY GOD");
	}

}
