package javaPrac;

public class ImmediateSmaller {
	 public static void immediateSmaller(int arr[], int n) {
	        // code here
		 for(int i = 0;i<n;i++) {
			 if(i==n-1) {
				 arr[n-1] = -1;
			 }else if(arr[i]>arr[i+1]) {
				 arr[i] = arr[i+1]; 
			 }else {
				 arr[i] = -1;
			 }	
		 }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5, 6, 2, 3, 1, 7};
		int n = arr.length;
		immediateSmaller(arr, n);

	}

}
