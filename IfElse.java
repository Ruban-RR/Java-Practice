package hackerRank;

import java.util.Scanner;

public class IfElse {
/*
 Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		 int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if(n%2!=0 || n%2==0 && n>=6 && n<=20 ) {
	        	System.out.println("Weird");
	        }
	        else if ((n%2==0 && n>=2 && n<=5) || (n%2==0 && n>20)) {
	        	System.out.println("Not Weird");
	        }
	            
	        
	        scanner.close();

	}

}
