package codes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> s = new HashMap<Integer,String>();
		s.put(16, "Ruban");
		s.put(2, "Rohit");
		s.put(3, "sai");
		s.put(null, null);
		s.put(null, "kohli");
		s.put(57, null);		    //multiple null values allowed
		s.put(null, "dhoni");      //last declared null key is considered
		s.put(8, null);    		//only one null key allowed
		System.out.println("------------------------------------HashMap-------------------------------------");
		System.out.println(s);
		System.out.println(s.containsKey(57));
		System.out.println(s.entrySet());
		System.out.println(s.values());
		System.out.println(s.keySet());
		
		Map<Integer,String> d = new TreeMap<Integer,String>();
		d.put(16, "Ruban");
		d.put(2, "Rohit");
		d.put(3, "sai");
		d.put(5, null);
		d.put(9, "kohli");
		d.put(57, null);		    //multiple null values allowed
		d.put(1, "dhoni");     	   //
		d.put(8, null);    		  //no null key is allowed
		System.out.println("------------------------------------TreeMap-------------------------------------");
		System.out.println(d);
		System.out.println(d.containsKey(57));
		System.out.println(d.entrySet());
		System.out.println(d.values());
		System.out.println(d.keySet());
		
		
	}

}
