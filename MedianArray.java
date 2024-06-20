package javaPrac;

import java.util.Arrays;

public class MedianArray {
	public int find_median(int[] v) {
		Arrays.sort(v);
		int div = 0;
		int len = v.length;
		if (len%2 == 1 ) {
			div = v[len/2];
		}else {
			div = (v[len/2]+v[len/2-1])/2;
		}
		return div;
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = {90, 100};
		MedianArray ans = new MedianArray();
		System.out.print(ans.find_median(v));

	}

}
