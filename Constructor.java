package codes;

public class Constructor {
	int a;
	int b;
	String name;
	
		Constructor() {
		a=23;
		b=32;
		name="Ruban";
	}
	    Constructor(int a,int b,String name){
		int A=a;
		int B=b;
		String NAME=name;
		System.out.println("Age  :"+A);
		System.out.println("Roll :"+B);
		System.out.println("Name :"+NAME);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c = new Constructor();
		Constructor b = new Constructor(2,4,"rub");
		System.out.println("Age  :"+c.a);
		System.out.println("Roll :"+c.b);
		System.out.println("Name :"+c.name);
		
	}

}
