package codes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] q = {1,4,3,5,2};
		LinkedList<Integer> a = new LinkedList<Integer>();
		a.add(4);
		a.add(46);
		a.add(43);
		a.add(9);
		a.add(6);
		a.add(1);
		a.add(67);
		a.add(32);
		a.add(23);
		System.out.println(a.getLast());
		System.out.println(a);
		System.out.println(a.contains(q));
		System.out.println(a.indexOf(43));
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf(a));
		System.out.println(a.remove(2));
		System.out.println(a.size());
		System.out.println(a);
		
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		b.add(25);
		b.add(42);
		b.add(5);
		b.add(1);
		b.add(6);
		b.add(8);
		b.add(3);
		System.out.println(b);
		b.trimToSize();
		b.addFirst(5);
		System.out.println(b.lastIndexOf(a));
	}

}
