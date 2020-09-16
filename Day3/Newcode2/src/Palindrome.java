import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int n,sum = 0, r;
	     System.out.print("Input a number: ");
	     Scanner in = new Scanner(System.in);
	     n = in.nextInt();
	     
		 int temp = n;    
	     while(n>0)
		   {    
	        r = n % 10;   
	        sum = (sum*10)+r;    
	        n = n/10;    
	       }    
	      if(temp==sum)    
	        System.out.println("It is a Palindrome number.");    
	      else    
	        System.out.println("Not a palindrome");    

	}

}
