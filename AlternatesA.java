package patterns;

public class AlternatesA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++) {
				if(k%2==0) {
					System.out.print("A");
				}
				else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
		
	
	}
}
	