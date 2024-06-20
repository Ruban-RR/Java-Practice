package codes;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "  ru  ban";
		String d = s.toUpperCase();
		System.out.println(s);
		System.out.println(d);
		
		StringBuffer a = new StringBuffer("ruban");
		
		
		String b = new String("ruban");
		String f = b.toUpperCase();
		System.out.println(b);
		System.out.println(f);
		System.out.println(s.strip());
		System.out.println(s.substring(1, 3));
		System.out.println(s.charAt(4));
		System.out.println(s.codePointAt(3));
		System.out.println(s.contains(a));
		System.out.println(s.length());
		System.out.println(s.valueOf(0));
		System.out.println(s.replace('r', 't'));
		
		System.out.println(a.replace(2, 4, s));
		System.out.println(a.delete(2, 4));
		System.out.println(a.lastIndexOf(s));
		System.out.println(a.indexOf(s));
		
	}

}
