package javaPrac;

public class BinarySearch {
	public static int binarysearch(int arr[], int n, int k) {
	        // code here
			int start = 0;
			int end = n-1;
			
			while(start<=end) {
				int mid = start+(end-start)/2;
				if(arr[mid]==k) {
					return mid;
				}else if(arr[mid]>k) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = 5;
		int[] arr = {1 ,2, 3, 4, 5};
		System.out.println(binarysearch(arr, n, k));
	}

}
