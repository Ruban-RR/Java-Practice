package javaPrac;

public class SearchArray {
	static int search(int arr[], int N, int X)
    {
        
        // Your code here
		for(int i = 0; i<N;i++) {
			if(arr[i]==X) {
				return i;
			}
		}
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int x = 5;
		int[] arr = {1,2,3,4,5};
		System.out.println(search(arr, n, x));
	}

}
