package javaPrac;

public class GCD {
	public static int gcdnum(int a, int b) {
//		int result = 0;
//		int small = b;
//		if(a<b) {
//			small = a;
//		}
//		for(int i = 1;i<=small;i++) {
//			if(a%i == 0 && b%i==0) {
//				result = i;
//			}
//		}
//		return result;
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 100;
			int b = 10;
			System.out.println(gcdnum(a,b));
	}

}
