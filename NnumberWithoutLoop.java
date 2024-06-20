package javaPrac;

public class NnumberWithoutLoop {
	public void printNos(int N)
    {
      printNumbersHelper(1, N);
    }
    public void printNumbersHelper(int current, int N) {
        if (current > N) {
            return; // Base case: if current exceeds n, return
        }
        System.out.print(current+" "); // Print the current number
        printNumbersHelper(current + 1, N); // Recursive call with incremented current
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		NnumberWithoutLoop ans = new NnumberWithoutLoop();
		ans.printNos(n);
	}

}
