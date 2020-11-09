package if_else;

import java.util.Scanner;

public class Q1172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a<=c&&a<=b) {
			if(c<b)
				System.out.printf("%d %d %d",a,c,b);
			else
				System.out.printf("%d %d %d",a,b,c);
		}else if(b<=a&&b<=c) {
			if(a<c)
				System.out.printf("%d %d %d",b,a,c);
			else
				System.out.printf("%d %d %d",b,c,a);
		}else if(c<=a&&c<=b) {
			if(a<b)
				System.out.printf("%d %d %d",c,a,b);
			else
				System.out.printf("%d %d %d",c,b,a);
		}
	}

}

/*
 * if (b < a){
        tmp = a;
        a = b;
        b = tmp;
    }
    
    if (c < a){
        tmp = a;
        a = c;
        c = tmp;
    }
    
    if (c < b){
        tmp = b;
        b = c;
        c = tmp;
    }
    
    System.out.printf("%d %d %d",a,b,c);
 * 
 * 
 * 
 * */
