package com.hcl.main;
import java.util.Scanner;
public class SortingNumber {
	
  public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter no of element count: ");
			int inVal = s.nextInt(), temp;
			System.out.print("Enter array values");
			int[] arr = new int[inVal];
			for(int i =0; i<inVal;i++){				
				arr[i]=s.nextInt();
			}
			for(int m=0;m<arr.length;m++){
				for(int n=m+1;n<arr.length;n++){
					if(arr[m]>arr[n]){
						temp = arr[m];
						arr[m]=arr[n];
						arr[n]=temp;
					}
				}
			}
			System.out.print("Sorted order are:");
			for(int a: arr){
				System.out.println(a);
			}		
		}

}
