package javaPrac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class UnionSet {
	 public static int doUnion(int a[], int n, int b[], int m) 
	    {
	        //Your code here
//		 ArrayList<Integer> list = new ArrayList<>();
//		 for(int i = 0;i<n;i++) {
//			 if(!list.contains(a[i])) {
//			 list.add(a[i]);}
//		 }
//		 for(int i = 0;i<m;i++) {
//			 if(!list.contains(b[i])) {
//				 list.add(b[i]);
//			 }
//		 }
//		 int len = list.size();
//		 return len;
		 HashSet<Integer> unionSet = new HashSet<>();
	        for (int i = 0; i < n; i++) {
	            unionSet.add(a[i]);
	        }
	        for (int j = 0; j < m; j++) {
	            unionSet.add(b[j]);
	        }
	        return unionSet.size();
	}
		
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int[] a = {85, 25, 1, 32, 54, 6};
		int m = 2;
		int[] b = {85,2};
		System.out.println(doUnion(a, n, b, m));
	}

}
