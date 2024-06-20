package javaPrac;

public class Swapkth {
	public static void swapp(int n, int k, int[] arr) {
			int begin = arr[k-1];
			int end = arr[n-k];
			arr[k-1] = end;
			arr[n-k] = begin;
			for(int num:arr) {
			System.out.print(num+" ");}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int k = 2;
		int[] arr = {5,3,6,1,2};
		swapp(n,k,arr);

	}

}
