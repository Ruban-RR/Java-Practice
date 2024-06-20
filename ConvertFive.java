package javaPrac;

public class ConvertFive {
	public static int convertfive(int num) {
		String orig = String.valueOf(num);
		String result = "";
		int len = orig.length();
		for(int i = 0;i<len;i++) {
			if(orig.charAt(i)=='0') {
				result+='5';
			}else {
				result+=orig.charAt(i);
			}
		}
		return Integer.valueOf(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1114;
		System.out.println(convertfive(num));
	}

}
