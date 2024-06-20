package javaPrac;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//System.out.println("Enter a number:");
		//int a = s.nextInt();
		//System.out.println("The number is:"+a);
		int[] nums = {5,3,5,2};
		for(int num:nums) {
			System.out.println(num);
		}
		for(int i = 0; i<=6; i++) {
			System.out.println(i);
		}
		int j = 0;
		while(j<5) {
			System.out.println(j);
			j++;
		}
	}

}
