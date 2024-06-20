package javaPrac;

public class DifferenceNumber {

    public void findExtra(int n, int arr1[], int arr2[]) {
        // The length of arr1 is n and the length of arr2 is n-1
        int len1 = arr1.length;
        int len2 = arr2.length;

        // Compare elements in both arrays
        for (int i = 0; i < len2; i++) {
            if (arr1[i] != arr2[i]) {
                // Print the index of the differing element
                System.out.println("The index of the extra element is: " + i);
                return;
            }
        }

        // If no difference is found, the extra element is the last one in arr1
        System.out.println("The index of the extra element is: " + (len1 - 1));
    }

    public static void main(String[] args) {
        int n = 7;
        int arr1[] = {2, 4, 6, 8, 9, 10, 12}; // First array with an extra element
        int arr2[] = {2, 4, 6, 8, 10, 12};   // Second array without the extra element

        DifferenceNumber dn = new DifferenceNumber();
        dn.findExtra(n, arr1, arr2);
    }
}

