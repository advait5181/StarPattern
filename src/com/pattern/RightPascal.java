package com.pattern;

import java.util.Scanner;

public class RightPascal {

	public static void main(String[] args) {
		
	 int rows;
	 
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Enter the rows:");
	 
	 rows=scan.nextInt();
	 
	 for(int i=0;i<=rows-1;i++) {
		 for(int j=0;j<=i;j++) {
			 System.out.print("*"+" ");
		 }
		 System.out.println();
	   }
	 for(int i =rows-1;i>=0;i--) {
		 for(int j=0;j<=i-1;j++) {
			 System.out.print("*"+" ");
		 }
		 System.out.println();
	    }
	}
}
