package if_else;

import java.util.Scanner;

public class Q1160 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		sc.close();

		if(day==1||day==3||day==5||day==7)
			System.out.print("oh my god");
		else
			System.out.print("enjoy");
	}

}

/*
 * switch(day){
	case 1: case 3: case 5: case 7:
		System.out.print("oh my god");
		break;
	default:
		System.out.print("enjoy");
		break;
			  
	}
 * 
 * */
