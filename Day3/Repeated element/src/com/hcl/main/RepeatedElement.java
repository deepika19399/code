package com.hcl.main;

public class RepeatedElement {

	
		
		    void printRepeat(int arr[], int size)  
		    { 
		        int i, j; 
		        System.out.println("Repeated Elements are :"); 
		        for (i = 0; i < size; i++)  
		        { 
		            for (j = i + 1; j < size; j++)  
		            { 
		                if (arr[i] == arr[j])  
		                    System.out.print(arr[i] + " "); 
		            } 
		        } 
		    } 
		  
		    public static void main(String[] args)  
		    { 
		        RepeatedElement repeat = new RepeatedElement(); 
		        int arr[] = {4, 2, 4, 5, 2, 3, 1}; 
		        int arr_size = arr.length; 
		        repeat.printRepeat(arr, arr_size); 
		    }
}


