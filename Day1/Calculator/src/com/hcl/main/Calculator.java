package com.hcl.main;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		        Scanner reader = new Scanner(System.in);
		        System.out.print("Enter two numbers: ");

		        int first = reader.nextInt();
		        int second = reader.nextInt();

		        System.out.print("Enter an operator: ");
		        char operator = reader.next().charAt(0);

		        int result;

		        switch(operator)
		        {
		            case '+':
		                result = first + second;
		                break;

		            case '-':
		                result = first - second;
		                break;

		            case '*':
		                result = first * second;
		                break;

		            case '/':
		                result = first / second;
		                break;

		            default:
		                System.out.printf("Enter the correct operator");
		                return;
		        }

		        System.out.printf("%d %c %d = %d", first, operator, second, result);
		    }
		}

