package javaPrac;

public class AlternateElementsOfArray {
	 public static void Answer(int arr[], int n)
	    {
	        // your code here
	        for (int i = 0; i<arr.length; i+=2){
	            System.out.print(arr[i]+" ");
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int arr[] = {1, 2, 3, 4, 5};
		AlternateElementsOfArray ans = new AlternateElementsOfArray();
		ans.Answer(arr, n);
	}

}
