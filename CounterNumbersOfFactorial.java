package javaPrac;

public class CounterNumbersOfFactorial {
	 static long facDigits(int N){
	        //code here
	        long fact=1;
	        for(int i = N;i>0;i--){
	            fact *= i;
	        }
	        return fact;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 27;
		System.out.println(facDigits(n));
	}

}
