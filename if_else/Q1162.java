package if_else;

import java.util.Scanner;

public class Q1162 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
		String sand = String.valueOf(year-month+day);
		String[] arr = sand.split("");
		
		if(Integer.parseInt(arr[arr.length-1])==0) 
			System.out.print("대박");
		else
			System.out.print("그럭저럭");
	}

}


/*
 * if((year-month+day)%10==0)
			System.out.print("대박");
		else
			System.out.print("그럭저럭");
 */