package javaPrac;

public class MissingNumber {
	public void missingNumbers(int n, int arr[]) {
		int len = arr.length;
		// Your code goes here
	    for(int i = 1; i<=n-1; i++){
	        if(i>len || i!=arr[i-1]){
			System.out.println(i);	
			break;
	        }
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		int n = 5;
	}

}
