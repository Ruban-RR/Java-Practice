package javaPrac;

public class FindBinary {
	boolean isBinary(String str) {
		Boolean s = true;
		for (int i = 0; i<str.length(); i++) {
			if(str.charAt(i)=='0' || str.charAt(i)=='1') {
				continue;
			}
			else {
				s=false;
			}
		}
		return s ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "10f";
		FindBinary ans = new FindBinary();
		System.out.print(ans.isBinary(str));

	}

}
