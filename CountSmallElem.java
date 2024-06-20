package javaPrac;

public class CountSmallElem {
	public int countOfElements(int n, int x, int[] arr) {
		int count = 0;
		for (int i =0; i<n;i++) {
			if(arr[i]<=x) {
				count+=1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 7;
		int x= 2;
		int[] arr = {1, 2, 2, 2, 5, 7, 9};
		CountSmallElem ans = new CountSmallElem();
		System.out.print(ans.countOfElements(n,x,arr));

	}

}
