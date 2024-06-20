package javaPrac;

public class PalinArray {
	public static int palinArray(int[] a, int n)
    {
		
           //add code here.
		for (int i = 0; i<a.length;i++) {
			int num = a[i];
			int temp = num;
			int r,sum = 0;
			
			  while(num>0){    
			   r=num%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   num=num/10;    
			  }
			  if(temp!=sum) {
				 return 0;
			  }
		}
		return 1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[] a = {121, 131, 151};
		PalinArray ans = new PalinArray();
		System.out.println(ans.palinArray(a, n));

	}

}
