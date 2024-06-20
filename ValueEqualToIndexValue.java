package javaPrac;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
	ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        int counter = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i<arr.length; i++){
            if(arr[i]==counter+1){
                list.add(arr[i]);
            }
            counter+=1;
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int arr[] = {15, 2, 45, 12, 7};
		ValueEqualToIndexValue ans = new ValueEqualToIndexValue();
		System.out.println(ans.valueEqualToIndex(arr, n));
	}

}
