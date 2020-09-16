package com.hcl.main;

import java.util.Scanner;

public class UseMainCode {


	public static void main(String[] args) {
	 
	Scanner SC= new Scanner(System.in);
		  int n = SC.nextInt();
		  int sum=0;
		    while(n>0)
		    {
		    int rem = n%10;
		    if(rem%2==0) {
		    sum=sum+(rem*rem);
		    }
		    n=n/10;
		    }
		   System.out.println("result is" +sum);

	}

}
