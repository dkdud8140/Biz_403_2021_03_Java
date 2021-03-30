package List_01;

import java.util.Arrays;
import java.util.Scanner;

public class List_01 {
	public static void main(String[] args) {
		
		Scanner scan = new java.util.Scanner(System.in) ; 
		
		int stuScore[] = new int[5] ;
		
		for(int i = 0 ; i < stuScore.length ; i ++) {
			stuScore[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(stuScore));
		
		
		
		
	}
}
