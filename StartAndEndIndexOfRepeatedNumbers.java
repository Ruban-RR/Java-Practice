package javaPrac;

public class StartAndEndIndexOfRepeatedNumbers {

    String pairindexes(long v[], long x) {
        int len = v.length;
        int st = -1; // Initialize start index with -1 (invalid index)
        int end = -1; // Initialize end index with -1 (invalid index)

        // Find the starting index of x
        for (int i = 0; i < len; i++) {
            if (x == v[i]) {
                st = i;
                break; // Stop once we find the first occurrence
            }
        }

        // Find the ending index of x
        if (st != -1) { // If start index is found
            for (int j = st; j < len; j++) {
                if (x != v[j]) {
                    end = j - 1;
                    break; // Stop once we find the last occurrence
                }
                if (j == len - 1) {
                    end = j; // If x is at the end of the array
                }
            }
        }

        // Return the result as a string with start and end indices
        return st + " " + end;
    }

    public static void main(String[] args) {
        long x = 5;
        long[] v = {1, 2, 3, 4, 5,5};
        StartAndEndIndexOfRepeatedNumbers b = new StartAndEndIndexOfRepeatedNumbers();
        System.out.println(b.pairindexes(v, x));
    }
}
