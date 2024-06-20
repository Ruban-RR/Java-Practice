package javaPrac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArraySubset {
public static String isSubset( long a1[], long a2[], long n, long m) {
        
	HashMap<Long, Integer> elementCount = new HashMap<>();

    // Count the occurrences of each element in a1
    for (int i = 0; i < n; i++) {
        elementCount.put(a1[i], elementCount.getOrDefault(a1[i], 0) + 1);
    }

    // Check if each element in a2 is present in a1 with enough occurrences
    for (int i = 0; i < m; i++) {
        if (!elementCount.containsKey(a2[i]) || elementCount.get(a2[i]) == 0) {
            return "No";
        }
        elementCount.put(a2[i], elementCount.get(a2[i]) - 1);
    }

    return "Yes";
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr1 = {1,1,2,3,4,5,6,7,8};
		long[] arr2 = {1,2,3,1};
		long n = arr1.length;
		long m = arr2.length;
		System.out.println(isSubset(arr1, arr2, n, m));
		
		
	}

}
