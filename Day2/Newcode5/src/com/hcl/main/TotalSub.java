package com.hcl.main;
import java.util.Scanner;
public class TotalSub {
		private static Scanner s;
		public static void main(String[] args) 
		{
			int DE, DC; 
		    float total, Percentage, Average;
			s = new Scanner(System.in);
			System.out.print(" Please Enter the two Subject Marks : ");
			DE = s.nextInt();	
			DC = s.nextInt();	
			total = DE + DC;
			Average = total / 2;
		    Percentage = (total / 200) * 100;
		    System.out.println(" Total =  " + total);
		    System.out.println(" Average =  " + Average);
		    System.out.println(" Percentage =  " + Percentage);
		}
	}
