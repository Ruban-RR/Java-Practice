package codes;

import java.util.Scanner;

public class OverridingExample{	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first number in both integer and float:");
		int n1=s.nextInt();
		float n11=s.nextFloat();
		
		System.out.println("Enter the second number in both integer and float:");
		int n2=s.nextInt();
		float n22=s.nextFloat();
		
		Div d = new Div();
		
		System.out.println("-----Integer Value-----");
		d.calculation(n1, n2);
		
		System.out.println("------Float Value------");
		d.calculation(n11, n22);
		

	}
}

