package javaPrac;

import java.util.HashMap;

public class ExceptionallyOdd {
	static int findOdd(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Traverse the array and update the frequency of each number in the hashmap
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the number with an odd frequency
        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) % 2 != 0) {
                return key;
            }
        }
        
        // If no odd frequency found (though there should be one according to problem statement)
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 5, 4, 5, 2, 4, 3, 5};
        System.out.println(findOdd(arr));  // Output should be 5
	}

}
