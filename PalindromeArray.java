package javaPrac;

public class PalindromeArray {
	public static boolean isPerfect(int n, int[] arr) {
        // code here
//		String temp = "";
//		String temp2 = "";
//		Boolean result = false;
//        for(int num:arr) {
//        	String elem = String.valueOf(num);
//        	temp+=elem;
//        }
//        for(int i = n-1;i>=0;i--) {
//        	String elem2 = String.valueOf(arr[i]);
//        	temp2+=elem2;
//        }
//        if(temp.equals(temp2)) {
//        	result = true;
//        }
//        System.out.println(temp);
//        System.out.println(temp2);
//        return result;
        for (int i = 0; i < n 	/ 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = {1, 2, 3, 2, 1};
		System.out.println(isPerfect(n, arr));

	}

}
