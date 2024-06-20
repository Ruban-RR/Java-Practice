package javaPrac;

public class Longeststring {
	public static String longstr(int n, String[] arr) {
		int big = arr[0].length();
		String bigstr = arr[0]; 
		for(int i = 1;i<n;i++) {
			if(arr[i].length()>big) {
				big = arr[i].length();
				bigstr = arr[i];
			}
		}
		return bigstr;	

	}
	public static void main(String[] args) {
		int n = 5;
		String[] arr = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
		System.out.println(longstr(n, arr));
		
	}

}
