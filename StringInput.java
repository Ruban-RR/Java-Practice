package hackerRank;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); 
		System.out.println("int:");
		int i = sc.nextInt();
		System.out.println("double:");
		double k = sc.nextDouble();
		sc.nextLine();
		
		//System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();              //reads string   
		System.out.print("You have entered: "+str);      
	}

}
