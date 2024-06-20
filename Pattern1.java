package javaPrac;

public class Pattern1 {
	public void printPattern(int n) {
		for (int i = n;i>=1;i--) {
			for (int j = n;j>=1;j--) {
				for(int k= 0 ;k<i;k++) {
					System.out.print(j);
				}	
			}
			System.out.print(" $");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		Pattern1 ans = new Pattern1();
		ans.printPattern(n);
	}

}
