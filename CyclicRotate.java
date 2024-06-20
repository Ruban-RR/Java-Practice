package javaPrac;

import java.util.ArrayList;

public class CyclicRotate {
    public static void rotate(int arr[], int n)
    {
        int last = arr[n-1];
        int counter = 2;
        for(int i = n-1;i>0;i--) {
        	arr[i]=arr[n-counter];
        	counter+=1;
        }
        arr[0]=last;
        for(int num:arr) {
        	System.out.print(num+" ");
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 8, 7, 6, 4, 2, 1, 3};
		int n = arr.length;
		rotate(arr, n);
	}

}
