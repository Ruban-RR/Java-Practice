package javaPrac;

import java.util.Arrays;

public class SameArray {
	public static boolean check(long A[],long B[],int N)
    {
        //Your code here
		Boolean result = true;
		Arrays.sort(A);
		Arrays.sort(B);
		for(int i =0;i<N;i++) {
			if(A[i]!=B[i]) {
				result = false;
			}
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 5;
		long[] A = {1,2,5,5,0};
		long[] B = {2,1,5,0,5};
		System.out.println(check(A, B, N));
	}

}
