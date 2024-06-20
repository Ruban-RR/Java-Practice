package javaPrac;

public class IsSparse {
	 public static boolean isSparse(int n)
	    {
	        // Your code here
		 	String bin = Integer.toBinaryString(n);
		 	for(int i = 0;i<bin.length();i++) {
		 		if(i == bin.length()-1) {
		 			return true;
		 		}else if(bin.charAt(i)=='1'&&bin.charAt(i)==bin.charAt(i+1)) {
		 			return false;
		 		}
		 	}
		 	return true;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3;
		System.out.println(isSparse(num));
	}

}
