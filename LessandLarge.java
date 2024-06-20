package javaPrac;

public class LessandLarge {
	public static int[] getMoreAndLess(int[] arr, int n, int x) {
        // code here
		int[] result = {0,0};
		for (int i =0; i<n;i++) {
			if(arr[i]<=x) {
				result[0]+=1;
			}
			if(arr[i]>=x) {
				result[1]+=1;
		}
			}
		for(int num:result) {
			System.out.println(num);
		}
		return result;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int x = 3;
		int[] arr = {3,3,3};
		System.out.println(getMoreAndLess(arr, n, x));

	}

}
