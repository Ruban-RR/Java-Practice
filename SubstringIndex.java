package javaPrac;

public class SubstringIndex {
	public static int strstr(String s, String x)
	    {
	       // Your code here
			return s.indexOf(x);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "GeeFkForGeeks";
		String x = "For";
		System.out.println(strstr(s, x));
	}

}
