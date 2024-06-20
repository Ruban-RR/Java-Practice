package javaPrac;

public class FibonacciSeries {
	public static long[] printFibb(int n) 
    {
		long[] result = new long[n];
        if(n == 1) {
        	result[0] = 1;
        	return result;
        }else if(n == 2) {
        	result[0] = 1;
        	result[1]= 1;
        }else {
        	int first = 0;
        	int second = 1;
        	int third = first+second;
        	result[0] = 1;
        	result[1]= 1;
        	for(int i=2;i<n;i++) {
        		third = first+second;
        		result[i] = third;
        		first = second;
        		second = third;
        		
        	}
        	
        	
        }
        for(long num:result) {
        	System.out.println(num);
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 75;
		System.out.println(printFibb(n));
	}

}
