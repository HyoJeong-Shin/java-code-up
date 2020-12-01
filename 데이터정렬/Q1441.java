package 데이터정렬;

import java.util.Scanner;

public class Q1441 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    int a = sc.nextInt();

	    int[] arr = new int[a];

	    for(int i = 0; i < arr.length; i++){
	    	int b = sc.nextInt();
	    	arr[i] = b;
	    }
	    
	    sc.close();
	    
	    for(int i = arr.length-1; i > 0; i--){
	        for(int j = 0; j < i; j++){
	          if(arr[j] > arr[j + 1]){
	            int temp = arr[j];
	            arr[j] = arr[j +1];
	            arr[j + 1] = temp;
	          }
	        }
	      }

	      for(int i = 0; i < arr.length; i++){
	        System.out.println(arr[i]);
	      }

	}

}
