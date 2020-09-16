package com.hcl.main;

public class CountWords {
	   public static void main(String[] args) {  
	        String s = "I am Deepika";  
	        int Count = 0;  
	          for(int i = 0; i < s.length()-1; i++) {    
	            if(s.charAt(i) == ' ' && Character.isLetter(s.charAt(i+1)) && (i > 0)) {  
	                Count++;  
	            } 
	          }
	                Count++; 
	        System.out.println("Total number of words in the given string: " + Count);  
	    }  
	}  
