package com.hcl.main;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
			    int x, y, z;
			    System.out.println("Enter 3 integers");
			    Scanner in = new Scanner(System.in);
			    x = in.nextInt();
			    y = in.nextInt();
			    z = in.nextInt();
			    if (x < y && x < z)
			      System.out.println("First number is the smallest.");
			    else if (y < x && y < z)
			      System.out.println("Second number is the smallest.");
			    else if (z < x && z < y)
			      System.out.println("Third number is the smallest.");
			    else
			      System.out.println("no");

	}

}
