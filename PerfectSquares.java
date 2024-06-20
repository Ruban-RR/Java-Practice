package javaPrac;

public class PerfectSquares {
	static int countSquares(int N) {
        // code here
		 // Finding the square root of N-1 and converting it to int
        int ans = (int)Math.sqrt(N-1);
        
        // Returning the result
        return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		System.out.println(countSquares(n));
	}

}
