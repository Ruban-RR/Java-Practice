package codes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> s = new HashSet<Integer>();
		s.add(4); //doesn't maintain order of elements
		s.add(6); //stored in hash table
		s.add(2); //allow one NULL value
		s.add(4);
		s.add(7);
		s.add(8);
		s.add(null);
		s.add(null); // does not allow two null because duplicate values are not allowed in set
		System.out.println(s);
		System.out.println(s.hashCode());
		System.out.println(s.contains(5));
		System.out.println(s.containsAll(s));
		
		Set<Integer> d = new TreeSet<Integer>();
		d.add(45);		// maintains elements in sorted order
		d.add(34);		// uses red-black tree to store elements
		d.add(23);      // does not allow NULL
		d.add(32);
		//d.add(null); -> throws NullPointer Exception!
		System.out.println(d);
		
		
	}

}
